package com.directu.problemsolving.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * TwoSumTest
 *
 * @author Umang G
 */
class TwoSumTest {
  private static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
        Arguments.of(new int[]{6, 2, 8, 4, 3}, 18, new int[]{-1, -1}),
        Arguments.of(new int[]{6, 2, 8, 4, 3}, 12, new int[]{2, 3}),
        Arguments.of(new int[]{9}, 2, new int[]{-1, -1})
    );
  }

  @ParameterizedTest(name = "One-pass Hash Table - {index} > {0}, {1} > ")
  @MethodSource("testCases")
  void testTwoSumOnePassHashTable(int[] nums, int target, int[] expected) {
    assertArrayEquals(expected, TwoSum.twoSumOnePassHashTable(nums, target));
  }

  @ParameterizedTest(name = "Two-pass Hash Table - {index} > {0}, {1} > ")
  @MethodSource("testCases")
  void testTwoSumTwoPassHashTable(int[] nums, int target, int[] expected) {
    assertArrayEquals(expected, TwoSum.twoSumTwoPassHashTable(nums, target));
  }

  @ParameterizedTest(name = "Brute Force Hash Table - {index} > {0}, {1} > ")
  @MethodSource("testCases")
  void testTwoSumBruteForce(int[] nums, int target, int[] expected) {
    assertArrayEquals(expected, TwoSum.twoSumBruteForce(nums, target));
  }

}