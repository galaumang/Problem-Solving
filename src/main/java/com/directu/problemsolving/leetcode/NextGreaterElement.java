package com.directu.problemsolving.leetcode;

import com.directu.common.util.ArrayUtils;

import java.util.Arrays;

/**
 * NextGreaterElement
 * Find the smallest number that has same set of digits as given number
 *
 * @author Umang G
 */
public class NextGreaterElement {
  /**
   * <p>{@code NextGreaterElement} instance should NOT be constructed in standard
   * programming, so its defined as private</p>
   */
  private NextGreaterElement() {
  }

  /**
   * nextGreaterElement
   * function to returns smallest number greater than number with same set
   * of digits
   *
   * @param number input number
   * @return smallest number greater than number with same set of digits
   */
  public static int nextGreaterElement(int number) {
    char[] noDigits = Integer.toString(number).toCharArray();
    int i;

    // I) Start from the right most digit and find the first digit that is
    // smaller than the digit next to it.
    for (i = noDigits.length - 1; i > 0; i--) {
      if (noDigits[i] > noDigits[i - 1])
        break;
    }

    // If no such digit is found, then all digits are in descending order means
    // there cannot be a greater number with same set of digits
    if (i == 0)
      return -1;
    else {
      int x = noDigits[i - 1], min = i;

      // II) Find the smallest digit on right side of (i-1)'th digit that is
      // greater than number[i-1]
      for (int j = i + 1; j < noDigits.length; j++) {
        if (noDigits[j] > x && noDigits[j] < noDigits[min]) {
          min = j;
        }
      }

      // III) Swap the above found smallest digit with number[i-1]
      ArrayUtils.swapArrayElements(noDigits, i - 1, min);

      // IV) Sort the digits after (i-1) in ascending order
      Arrays.sort(noDigits, i, noDigits.length);

      return Integer.parseInt(new String(noDigits));
    }
  }
}
