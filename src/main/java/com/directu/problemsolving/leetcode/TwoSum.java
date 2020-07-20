package com.directu.problemsolving.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * TwoSum
 * Find indices of the two numbers such that they add up to a specific target
 *
 * @author Umang G
 */
public class TwoSum {
  /**
   * twoSumOnePassHashTable
   *
   * @param nums   array elements
   * @param target target value
   * @return array of two indices
   */
  public static int[] twoSumOnePassHashTable(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int index = 0; index < nums.length; index++) {
      if (map.containsKey(nums[index])) {
        return new int[]{map.get(nums[index]), index};
      } else {
        map.put(target - nums[index], index);
      }
    }
    return new int[]{-1, -1};
  }

  /**
   * twoSumTwoPassHashTable
   *
   * @param nums   array elements
   * @param target target value
   * @return array of two indices
   */
  public static int[] twoSumTwoPassHashTable(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement) && map.get(complement) != i) {
        return new int[]{i, map.get(complement)};
      }
    }
    return new int[]{-1, -1};
  }

  /**
   * twoSumBruteForce
   *
   * @param nums   array elements
   * @param target target value
   * @return array of two indices
   */
  public static int[] twoSumBruteForce(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++)
      for (int j = i + 1; j < nums.length; j++)
        if (nums[j] == target - nums[i]) {
          return new int[]{i, j};
        }
    return new int[]{-1, -1};
  }

}
