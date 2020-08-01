package com.directu.problemsolving.leetcode;

import com.directu.common.util.StringUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * LongestSubstring
 * Find the length of longest substring without repeating characters
 *
 * @author Umang G
 */
public class LongestSubstring {
  /**
   * <p>{@code LongestSubstring} instance should NOT be constructed in standard
   * programming, so its defined as private</p>
   */
  private LongestSubstring() {
  }

  /**
   * lengthOfLongestSubstringWithoutRepeatingCharBruteForce
   *
   * @param s input string
   * @return length of longest substring without repeating characters
   */
  public static int lengthOfLongestSubstringWithoutRepeatingCharBruteForce(String s) {
    int lengthOfLongestSubstring = 0;
    int strLength = s.length();
    for (int i = 0; i < strLength; i++)
      for (int j = i + 1; j <= strLength; j++)
        if (StringUtils.checkAllUnique(s, i, j))
          lengthOfLongestSubstring = Math.max(lengthOfLongestSubstring, j - i);
    return lengthOfLongestSubstring;
  }

  /**
   * lengthOfLongestSubstringWithoutRepeatingCharSlidingWindow
   *
   * @param s input string
   * @return length of longest substring without repeating characters
   */
  public static int lengthOfLongestSubstringWithoutRepeatingCharSlidingWindow(String s) {
    int n = s.length();
    Set<Character> set = new HashSet<>();
    int ans = 0;
    int i = 0;
    int j = 0;
    while (i < n && j < n) {          // try to extend the range [i, j]
      if (!set.contains(s.charAt(j))) {
        set.add(s.charAt(j++));
        ans = Math.max(ans, j - i);
      } else
        set.remove(s.charAt(i++));
    }
    return ans;
  }

  /**
   * lengthOfLongestSubstringWithoutRepeatingCharSlidingWindowOptimized
   *
   * @param s input string
   * @return length of longest substring without repeating characters
   */
  public static int lengthOfLongestSubstringWithoutRepeatingCharSlidingWindowOptimized(String s) {
    int n = s.length();
    int ans = 0;
    Map<Character, Integer> map = new HashMap<>();  // current index of character
    for (int j = 0, i = 0; j < n; j++) {            // try to extend the range [i, j]
      if (map.containsKey(s.charAt(j)))
        i = Math.max(map.get(s.charAt(j)), i);
      ans = Math.max(ans, j - i + 1);
      map.put(s.charAt(j), j + 1);
    }
    return ans;
  }
}