package com.directu.problemsolving.sort;

import com.directu.common.util.ArrayUtils;

/**
 * BubbleSort
 *
 * @author Umang G
 */
public class BubbleSort {
  /**
   * <p>{@code BubbleSort} instance should NOT be constructed in standard
   * programming, so its defined as private</p>
   */
  private BubbleSort() {
  }

  /**
   * Bubble sort algorithm
   *
   * @param elements elements to sort
   */
  public static void sort(int[] elements) {
    for (int element = elements.length - 1; element >= 0; element--) {
      for (int index = 0; index < element; index++) {
        if (elements[index] > elements[index + 1]) {
          ArrayUtils.swapArrayElements(elements, index, index + 1);
        }
      }
    }
  }
}
