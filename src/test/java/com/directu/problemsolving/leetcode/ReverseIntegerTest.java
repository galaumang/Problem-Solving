package com.directu.problemsolving.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * ReverseIntegerTest
 *
 * @author Umang G
 */
class ReverseIntegerTest {
  private static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of(123, 321),
        Arguments.of(-123, -321),
        Arguments.of(120, 21)
    );
  }

  @ParameterizedTest(name = "{index} > {0}, {1} > ")
  @MethodSource("testCases")
  void reverseTest(int x, int expected) {
    assertEquals(expected, ReverseInteger.reverse(x));
  }
}