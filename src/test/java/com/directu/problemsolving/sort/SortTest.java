package com.directu.problemsolving.sort;

import com.directu.problemsolving.leetcode.TwoSum;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * SortTest
 *
 * @author Umang G
 */
public class SortTest {
  private static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of(new int[]{23, 38, 19, 1, 22}, new int[]{1, 19, 22, 23, 38}),
        Arguments.of(new int[]{4, 3, 8, 9, -2, 6, 10, 13, 4, 5, -9, 0, -2}, new int[]{-9, -2, -2, 0, 3, 4, 4, 5, 6, 8, 9, 10, 13})
    );
  }

  @ParameterizedTest(name = "Bubble Sort - {index} > {0} > ")
  @MethodSource("testCases")
  public void bubbleSortTest(int[] inputElements, int[] expected) {
    BubbleSort.sort(inputElements);
    assertArrayEquals(expected, inputElements);
  }

  @ParameterizedTest(name = "Heap Sort - {index} > {0} > ")
  @MethodSource("testCases")
  public void heapSortTest(int[] inputElements, int[] expected) {
    HeapSort.sort(inputElements);
    assertArrayEquals(expected, inputElements);
  }

  @ParameterizedTest(name = "Insertion Sort - {index} > {0} > ")
  @MethodSource("testCases")
  public void insertionSortTest(int[] inputElements, int[] expected) {
    InsertionSort.sort(inputElements);
    assertArrayEquals(expected, inputElements);
  }

  @ParameterizedTest(name = "Merge Sort - {index} > {0} > ")
  @MethodSource("testCases")
  public void mergeSortTest(int[] inputElements, int[] expected) {
    MergeSort.sort(inputElements, 0, inputElements.length - 1);
    assertArrayEquals(expected, inputElements);
  }

  @ParameterizedTest(name = "Quick Sort - {index} > {0} > ")
  @MethodSource("testCases")
  public void quickSortTest(int[] inputElements, int[] expected) {
    QuickSort.sort(inputElements, 0, inputElements.length - 1);
    assertArrayEquals(expected, inputElements);
  }

  @ParameterizedTest(name = "Selection Sort - {index} > {0} > ")
  @MethodSource("testCases")
  public void selectionSortTest(int[] inputElements, int[] expected) {
    SelectionSort.sort(inputElements);
    assertArrayEquals(expected, inputElements);
  }

  @ParameterizedTest(name = "Shell Sort - {index} > {0} > ")
  @MethodSource("testCases")
  public void shellSortTest(int[] inputElements, int[] expected) {
    ShellSort.sort(inputElements);
    assertArrayEquals(expected, inputElements);
  }
}
