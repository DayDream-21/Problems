package com.slavamashkov.problems.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * <h3>3. Longest Substring Without Repeating Characters</h3>
 *
 * <p>Given a string {@code s}, find the length of the <b>longest substring</b> without repeating characters.</p>
 * */

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbb")); // 1
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("pwwkew")); // 3
        System.out.println(lengthOfLongestSubstring("abcd")); // 4
        System.out.println(lengthOfLongestSubstring("dasqdf")); // 5
        System.out.println(lengthOfLongestSubstring("dvdf")); // 3
    }

    private static int lengthOfLongestSubstring(String s) {
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;

        Set<Character> hashSet = new HashSet<>();

        while (b_pointer < s.length()) {
            if (!hashSet.contains(s.charAt(b_pointer))) {
                hashSet.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(hashSet.size(), max);
            } else {
                hashSet.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }

        return max;
    }
}
