package com.directu.problemsolving.sort;

/**
 * InsertionSort
 *
 * @author Umang G
 */
public class InsertionSort {
  /**
   * <p>{@code InsertionSort} instance should NOT be constructed in standard
   * programming, so its defined as private</p>
   */
  private InsertionSort() {
  }

  /**
   * Insertion sort algorithm
   *
   * @param elements elements to sort
   */
  public static void sort(int[] elements) {
    for (int element = 0; element < elements.length; element++) {
      int index = element;
      int insertElement = elements[element];
      while (index > 0 && elements[index - 1] > insertElement) {
        elements[index] = elements[index - 1];
        index = index - 1;
      }
      elements[index] = insertElement;
    }
  }
}
