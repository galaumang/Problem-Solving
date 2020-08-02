package com.directu.problemsolving.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * CountingElements
 *
 * @author Umang G
 */
public class CountingElements {
  /**
   * <p>{@code CountingElements} instance should NOT be constructed in standard
   * programming, so its defined as private</p>
   */
  private CountingElements() {
  }

  /**
   * countElements
   * count the element x such that x + 1 element is present in the same array
   *
   * @param arr array elements
   * @return count of x elements
   */
  public static int countElements(int[] arr) {
    int count = 0;
    Set<Integer> elements = new HashSet<>();
    for (int element : arr)
      elements.add(element);
    for (int x : arr)
      if (elements.contains(x + 1))
        count++;
    return count;
  }
}
