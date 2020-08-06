package com.directu.problemsolving.array;

/**
 * FairIndexes
 * Find number of fair indexes which split the two arrays into four non-empty arrays of equal sum
 *
 * @author Umang G
 */
public class FairIndexes {
  /**
   * <p>{@code FairIndexes} instance should NOT be constructed in standard
   * programming, so its defined as private</p>
   */
  private FairIndexes() {
  }

  /**
   * fairIndexes
   * function to return number of fair indexes
   * Time complexity: O(n) where n is length of arrays
   * Space Complexity: O(n) where n is length of arrays
   *
   * @param arrayOne first array
   * @param arrayTwo second array
   * @return number of fair indexes
   */
  public static int fairIndexes(int[] arrayOne, int[] arrayTwo) {
    int length = arrayOne.length; // Length of both array is same
    // store the incremental sum of both array elements
    int[] incrementalSumArrayOne = new int[length + 1];
    int[] incrementalSumArrayTwo = new int[length + 1];
    for (int index = 1; index <= length; index++) {
      incrementalSumArrayOne[index] = incrementalSumArrayOne[index - 1] + arrayOne[index - 1];
      incrementalSumArrayTwo[index] = incrementalSumArrayTwo[index - 1] + arrayTwo[index - 1];
    }
    int noOfFairIndices = 0;
    for (int index = 1; index < length; index++) {
      // all possible indexes check if sum is same for all four sub arrays
      if (incrementalSumArrayOne[index] == incrementalSumArrayTwo[index] &&
          incrementalSumArrayOne[index] == incrementalSumArrayOne[length] - incrementalSumArrayOne[index] &&
          incrementalSumArrayTwo[index] == incrementalSumArrayTwo[length] - incrementalSumArrayTwo[index])
        noOfFairIndices++;
    }
    return noOfFairIndices;
  }
}
