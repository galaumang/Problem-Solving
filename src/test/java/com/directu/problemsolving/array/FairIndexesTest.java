package com.directu.problemsolving.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * FairIndexesTest
 *
 * @author Umang G
 */
class FairIndexesTest {
  private static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of(new int[]{4, -1, 0, 3}, new int[]{-2, 5, 0, 3}, 2),
        Arguments.of(new int[]{2, -2, -3, 3}, new int[]{0, 0, 4, -4}, 1),
        Arguments.of(new int[]{4, -1, 0, 3}, new int[]{-2, 6, 0, 4}, 0),
        Arguments.of(new int[]{3, 2, 6}, new int[]{4, 1, 6}, 0),
        Arguments.of(new int[]{1, 4, 2, -2, 5}, new int[]{7, -2, -2, 2, 5}, 2)
    );
  }

  @ParameterizedTest(name = "{index} > {0} {1} > ")
  @MethodSource("testCases")
  void fairIndexesTest(int[] arrayOne, int[] arrayTwo, int expected) {
    assertEquals(expected, FairIndexes.fairIndexes(arrayOne, arrayTwo));
  }
}