package com.directu.problemsolving.dynamic;

import com.directu.common.util.IntegerUtils;

/**
 * StringConvert
 * Converts string X into string Y with below cost options
 * at a cost of 3, delete a single character from X.
 * at a cost of 4, insert a single character at any position in X.
 * at a cost of 5, replace two consecutive characters in X with some other character.
 *
 * @author Umang G
 */
public class StringConvert {
  /**
   * convertString
   * function to convert string X into string Y at minimal cost.
   *
   * @param toConvert string X to be converted
   * @param toMatch   string Y to match with
   * @return minimum conversion cost
   */
  public static int convertString(String toConvert, String toMatch) {
    int[][] solution = new int[toConvert.length() + 1][toMatch.length() + 1];
    int removeCost = 3;
    int insertCost = 4;
    int replaceCost = 5;

    for (int lengthY = 0; lengthY <= toMatch.length(); lengthY++) {
      for (int lengthX = 0; lengthX <= toConvert.length(); lengthX++) {
        if (lengthY == 0) {
          solution[lengthX][0] = lengthX * removeCost;
          continue;
        }
        if (lengthX == 0) {
          solution[0][lengthY] = lengthY * insertCost;
          continue;
        }
        if (toConvert.charAt(lengthX - 1) == toMatch.charAt(lengthY - 1)) {
          solution[lengthX][lengthY] = solution[lengthX - 1][lengthY - 1];
          continue;
        }
        int ifRemoved = solution[lengthX - 1][lengthY] + removeCost;
        int ifInserted = solution[lengthX][lengthY - 1] + insertCost;
        int ifReplaced = Integer.MAX_VALUE;
        if (lengthX > 1) {
          ifReplaced = solution[lengthX - 2][lengthY - 1] + replaceCost;
        }
        solution[lengthX][lengthY] =
            IntegerUtils.minimum(ifRemoved, ifInserted, ifReplaced);
      }
    }
    return solution[toConvert.length()][toMatch.length()];
  }
}
