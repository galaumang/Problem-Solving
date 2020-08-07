package com.directu.problemsolving.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * NextGreaterElementTest
 *
 * @author Umang G
 */
class NextGreaterElementTest {
  private static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of(218765, 251678),
        Arguments.of(4321, -1),
        Arguments.of(1234, 1243),
        Arguments.of(534976, 536479)
    );
  }

  @ParameterizedTest(name = "{index} > {0} {1} > ")
  @MethodSource("testCases")
  void findNextTest(Integer number, int expected) {
    assertEquals(expected, NextGreaterElement.nextGreaterElement(number));
  }
}