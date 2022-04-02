package com.slavamashkov.problems.leetcode.easy;

/**
 * <h3>344. Reverse String</h3>
 *
 * <p>Write a function that reverses a string. The input string is given as an array of characters {@code s}.</p>
 *
 * <p>You must do this by modifying the input array {@code in-place} with {@code O(1)} extra memory.</p>
 */

public class ReverseString {
    public static void main(String[] args) {

    }

    protected static void reverseString(char[] s) {
        int leftPointer = 0;
        int rightPointer = s.length - 1;

        while (leftPointer < rightPointer) {
            char temp = s[leftPointer];
            s[leftPointer] = s[rightPointer];
            s[rightPointer] = temp;

            leftPointer++;
            rightPointer--;
        }
    }
}
