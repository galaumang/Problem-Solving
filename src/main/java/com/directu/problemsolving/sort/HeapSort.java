package com.directu.problemsolving.sort;

import com.directu.common.util.ArrayUtils;

/**
 * HeapSort
 *
 * @author Umang G
 */
public class HeapSort {
  /**
   * <p>{@code HeapSort} instance should NOT be constructed in standard
   * programming, so its defined as private</p>
   */
  private HeapSort() {
  }

  /**
   * Heap sort algorithm
   *
   * @param elements elements to sort
   */
  public static void sort(int[] elements) {
    int noOfElements = elements.length;
    // Build heap (rearrange array)
    for (int index = noOfElements / 2 - 1; index >= 0; index--)
      heapify(elements, noOfElements, index);

    // One by one extract an element from heap
    for (int index = noOfElements - 1; index >= 0; index--) {
      // Move current root to end
      ArrayUtils.swapArrayElements(elements, 0, index);

      // call max heapify on the reduced heap
      heapify(elements, index, 0);
    }
  }

  private static void heapify(int[] elements, int heapSize, int startIndex) {
    int largest = startIndex;  // Initialize largest as root
    int left = 2 * startIndex + 1;  // left = 2*i + 1
    int right = 2 * startIndex + 2;  // right = 2*i + 2

    // If left child is larger than root
    if (left < heapSize && elements[left] > elements[largest])
      largest = left;

    // If right child is larger than largest so far
    if (right < heapSize && elements[right] > elements[largest])
      largest = right;

    // If largest is not root
    if (largest != startIndex) {
      ArrayUtils.swapArrayElements(elements, startIndex, largest);

      // Recursively heapify the affected sub-tree
      heapify(elements, heapSize, largest);
    }
  }
}
