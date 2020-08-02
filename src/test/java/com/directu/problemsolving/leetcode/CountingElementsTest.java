package com.directu.problemsolving.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * CountingElementsTest
 *
 * @author Umang G
 */
class CountingElementsTest {
  private static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of(new int[]{1, 2, 3}, 2),
        Arguments.of(new int[]{1, 1, 3, 3, 5, 5, 7, 7}, 0),
        Arguments.of(new int[]{1, 3, 2, 3, 5, 0}, 3),
        Arguments.of(new int[]{1, 1, 2, 2}, 2)
    );
  }

  @ParameterizedTest(name = "{index} > {0} > ")
  @MethodSource("testCases")
  void countElementsTest(int[] inputElements, int expected) {
    assertEquals(expected, CountingElements.countElements(inputElements));
  }
}