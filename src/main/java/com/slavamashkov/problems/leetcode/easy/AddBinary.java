package com.slavamashkov.problems.leetcode.easy;

/**
 * <h3>67. Add Binary</h3>
 *
 * <p>Given two binary strings {@code a} and {@code b}, return <i>their sum as a binary string</i>.</p>
 */

public class AddBinary {
    public static void main(String[] args) {
        String str1 = "11";
        String str2 = "1";

        System.out.println(addBinary(str1, str2));
    }

    private static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }

            sb.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        if (carry != 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
