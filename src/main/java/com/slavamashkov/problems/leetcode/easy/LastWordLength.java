package com.slavamashkov.problems.leetcode.easy;

/**
 * <h3>58. Length of Last Word</h3>
 *
 * <p>Given a string {@code s} consisting of words and spaces, return <i>the length of the <b>last</b> word in the string.</i></p>
 * <p>A <b>word</b> is a maximal substring consisting of non-space characters only.</p>
 */

public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        String t_s = s.trim();
        String r_s = t_s.replace(' ', '.');
        String[] arr_s = r_s.split("\\.");

        return arr_s[arr_s.length - 1].length();
    }
}
