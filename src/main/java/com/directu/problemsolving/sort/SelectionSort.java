package com.directu.problemsolving.sort;

import com.directu.common.util.ArrayUtils;

/**
 * SelectionSort
 *
 * @author Umang G
 */
public class SelectionSort {
  /**
   * <p>{@code SelectionSort} instance should NOT be constructed in standard
   * programming, so its defined as private</p>
   */
  private SelectionSort() {
  }

  /**
   * Selection sort algorithm
   *
   * @param elements elements to sort
   */
  public static void sort(int[] elements) {
    int minimum;
    int minimumIndex;
    for (int element = 0; element < elements.length - 1; element++) {
      minimum = elements[element];
      minimumIndex = element;
      for (int index = element + 1; index < elements.length; index++) {
        if (elements[index] < minimum) {
          minimum = elements[index];
          minimumIndex = index;
        }
      }
      ArrayUtils.swapArrayElements(elements, element, minimumIndex);
    }
  }
}
