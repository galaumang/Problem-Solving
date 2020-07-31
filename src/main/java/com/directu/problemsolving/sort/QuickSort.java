package com.directu.problemsolving.sort;

import com.directu.common.util.ArrayUtils;

/**
 * QuickSort
 *
 * @author Umang G
 */
public class QuickSort {
  /**
   * Quick sort algorithm
   *
   * @param elements elements to sort
   */
  public static void sort(int[] elements, int start, int end) {
    if (start < end) {
      int partition = partition(elements, start, end);
      sort(elements, start, partition - 1);
      sort(elements, partition + 1, end);
    }
  }

  private static int partition(int[] elements, int start, int end) {
    int startIndex = start;
    int endIndex = end;
    int startElement = elements[start];
    while (startIndex < endIndex) {
      while (startIndex <= end && elements[startIndex] <= startElement)
        startIndex++;
      while (elements[endIndex] > startElement)
        endIndex--;
      if (startIndex < endIndex)
        ArrayUtils.swapArrayElements(elements, startIndex, endIndex);
    }
    ArrayUtils.swapArrayElements(elements, start, endIndex);
    return endIndex;
  }
}
