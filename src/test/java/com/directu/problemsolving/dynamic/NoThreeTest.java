package com.directu.problemsolving.dynamic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * NoThreeTest
 *
 * @author Umang G
 */
class NoThreeTest {
  private static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of(new int[]{3, 4, 5, 1, 2}, 11),
        Arguments.of(new int[]{6, 7, 1, 2, 8, 9}, 30),
        Arguments.of(new int[]{1, 9, 2, 8, 3, 7, 4, 6, 5, 5, 6, 7, 8, 9, 1, 2, 3, 2, 4, 1, 8, 8, 9, 7, 6, 9, 1, 3, 2, 6}, 110)
    );
  }

  @ParameterizedTest(name = "{index} > {0} > ")
  @MethodSource("testCases")
  void testMaximumSumWithNoThreeConsecutiveElement(int[] nums, int expected) {
    assertEquals(expected, NoThree.maximumSumWithNoThreeConsecutiveElement(nums));
  }
}