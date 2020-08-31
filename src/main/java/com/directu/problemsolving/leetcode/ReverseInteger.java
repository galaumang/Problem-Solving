package com.directu.problemsolving.leetcode;

/**
 * ReverseInteger
 * Reverse digits of an integer
 *
 * @author Umang G
 */
public class ReverseInteger {
  /**
   * <p>{@code ReverseInteger} instance should NOT be constructed in standard
   * programming, so its defined as private</p>
   */
  private ReverseInteger() {
  }

  /**
   * Reverse digits of an integer and return the integer, if result is not in
   * 32-bit signed integer then it return 0
   *
   * @param x integer to be reverse
   * @return reversed integer or 0
   */
  public static int reverse(int x) {
    int reverse = 0;
    while (x != 0) {
      int pop = x % 10;
      x /= 10;
      if (reverse > Integer.MAX_VALUE / 10 ||
          (reverse == Integer.MAX_VALUE / 10 && pop > Integer.MAX_VALUE % 10))
        return 0;
      if (reverse < Integer.MIN_VALUE / 10 ||
          (reverse == Integer.MIN_VALUE / 10 && pop < Integer.MIN_VALUE % 10))
        return 0;
      reverse = reverse * 10 + pop;
    }
    return reverse;
  }
}

/*
7. Reverse Integer (https://leetcode.com/problems/reverse-integer/)

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:
  Input: 123
  Output: 321
Example 2:
  Input: -123
  Output: -321
Example 3:
  Input: 120
  Output: 21

Note:
Assume we are dealing with an environment which could only store integers
within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose
of this problem, assume that your function returns 0 when the reversed
integer overflows.

 */