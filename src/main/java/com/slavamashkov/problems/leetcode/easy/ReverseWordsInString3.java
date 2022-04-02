package com.slavamashkov.problems.leetcode.easy;

/**
 * <h3>557. Reverse Words in a String III</h3>
 *
 * <p>Given a string {@code s}, reverse the order of characters in each word within a sentence while still preserving
 * whitespace and initial word order.</p>
 */

public class ReverseWordsInString3 {
    public static void main(String[] args) {
        String s1 = "Let's take LeetCode contest";
        String s2 = "God Ding";

        System.out.println(reverseWords(s1));
        System.out.println(fasterReverseWords(s1));
        System.out.println(reverseWords(s2));
        System.out.println(fasterReverseWords(s2));
    }

    protected static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strings = s.split(" ");

        for (String string : strings) {
            int leftPointer = 0;
            int rightPointer = string.length() - 1;
            char[] chars = string.toCharArray();

            while (leftPointer < rightPointer) {
                char temp = chars[leftPointer];
                chars[leftPointer] = chars[rightPointer];
                chars[rightPointer] = temp;

                leftPointer++;
                rightPointer--;
            }

            sb.append(new String(chars)).append(" ");
        }

        return sb.toString().trim();
    }

    protected static String fasterReverseWords(String s) {
        char[] chars = s.toCharArray();

        int i = 0;
        int j = 0;

        while (j < chars.length) {
            if (chars[j] == ' ') {
                reverseWord(chars, i, j - 1);
                i = j + 1;
            }

            j++;
        }
        reverseWord(chars, i, j-1);
        return new String(chars);
    }

    private static void reverseWord(char[] chars, int i, int j) {
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            i++;
            j--;
        }
    }
}
