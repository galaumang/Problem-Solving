package com.directu.problemsolving.dynamic;

import com.directu.common.util.IntegerUtils;

/**
 * NoThree
 * To find a sub-sequence with the maximum possible sum, with the restriction
 * that we are not allowed to take three consecutive elements from the
 * original sequence.
 *
 * @author Umang G
 */
public class NoThree {
  /**
   * <p>{@code NoThree} instance should NOT be constructed in standard
   * programming, so its defined as private</p>
   */
  private NoThree() {
  }

  /**
   * maximumSumWithNoThreeConsecutiveElement
   * function to find a maximum possible sum of subsequence, with the
   * restriction that we are not allowed to take three consecutive elements
   * from input sequence
   *
   * @param inputSequence elements in input sequence
   * @return int maximum sum of subsequence
   */
  public static int maximumSumWithNoThreeConsecutiveElement(int[] inputSequence) {
    int[] solution = new int[inputSequence.length + 1];
    solution[0] = 0;

    // For each element in input sequence.
    for (int length = 1; length <= inputSequence.length; length++) {
      // First element.
      if (length == 1) {
        solution[length] = inputSequence[length - 1];
        continue;
      }
      // Second element.
      if (length == 2) {
        solution[length] = solution[length - 1] +
            inputSequence[length - 1];
        continue;
      }
      // Rest all elements (ie. except first and second).
      int one = solution[length - 3] + inputSequence[length - 1] +
          inputSequence[length - 2];

      int two = solution[length - 2] + inputSequence[length - 1];
      int three = solution[length - 1];
      solution[length] = IntegerUtils.maximum(one, two, three);
    }
    return solution[inputSequence.length];
  }
}
