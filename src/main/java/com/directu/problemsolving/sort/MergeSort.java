package com.directu.problemsolving.sort;

/**
 * MergeSort
 *
 * @author Umang G
 */
public class MergeSort {
  /**
   * <p>{@code MergeSort} instance should NOT be constructed in standard
   * programming, so its defined as private</p>
   */
  private MergeSort() {
  }

  /**
   * Merge sort algorithm
   *
   * @param elements elements to sort
   */
  public static void sort(int[] elements, int start, int end) {
    if (start < end) {
      int middleIndex = (start + end) / 2;
      sort(elements, start, middleIndex);
      sort(elements, middleIndex + 1, end);
      merge(elements, start, middleIndex + 1, end);
    }
  }

  private static void merge(int[] elements, int start, int middle, int end) {
    int[] mergedElements = new int[elements.length];
    int mergedIndex = -1;
    int startIndex = start;
    int middleIndex = middle;
    while (startIndex <= middle - 1 && middleIndex <= end) {
      if (elements[startIndex] < elements[middleIndex])
        mergedElements[++mergedIndex] = elements[startIndex++];
      else
        mergedElements[++mergedIndex] = elements[middleIndex++];
    }
    if (middleIndex > end) {
      for (int index = startIndex; index <= middle - 1; index++)
        mergedElements[++mergedIndex] = elements[index];
    } else {
      for (int index = middleIndex; index <= end; index++)
        mergedElements[++mergedIndex] = elements[index];
    }
    for (int index = 0; index <= mergedIndex; index++)
      elements[start + index] = mergedElements[index];
  }
}
