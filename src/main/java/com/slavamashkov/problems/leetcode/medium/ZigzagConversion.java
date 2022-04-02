package com.slavamashkov.problems.leetcode.medium;

/**
 * <h3>6. Zigzag Conversion</h3>
 *
 * <p>The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:</p>
 *
 * <pre>
 * {@code
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * }</pre>
 *
 * <p>And then read line by line: "PAHNAPLSIIGYIR"</p>
 *
 * <p>Write the code that will take a string and make this conversion given a number of rows:</p>
 *
 * <p>{@code string convert(string s, int numRows);}</p>
 */

public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }

    private static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();

        for (int r = 0; r < numRows; r++) {
            int increment = 2 * (numRows - 1);
            for (int i = r; i < s.length(); i += increment) {
                sb.append(s.charAt(i));
                if (r > 0 && r < (numRows - 1) && (i + increment - 2 * r) < s.length()) {
                    sb.append(s.charAt(i + increment - 2 * r));
                }
            }
        }

        return sb.toString();
    }
}
