package com.slavamashkov.problems.leetcode.medium;

/**
 * <h3>567. Permutation in String</h3>
 *
 * <p>Given two strings {@code s1} and {@code s2}, return {@code true} <i>if</i> {@code s2} <i>contains a permutation
 * of</i> {@code s1}, <i>or</i> {@code false} <i>otherwise</i>.</p>
 *
 * <p>In other words, return {@code true} if one of {@code s1}'s permutations is the substring of {@code s2}.</p>
 */

public class PermutationInString {
    public static void main(String[] args) {
        String s1_1 = "abb";
        String s1_2 = "ab";

        String s2_1 = "eidbaboo";
        String s2_2 = "eidboaoo";

        System.out.println(checkInclusion(s1_1, s2_1));
        System.out.println(checkInclusion(s1_2, s2_2));
    }

    protected static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1map = new int[26];
        int[] s2map = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1map[s1.charAt(i) - 'a']++;
            s2map[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (matches(s1map, s2map)) {
                return true;
            }

            s2map[s2.charAt(i + s1.length()) - 'a']++;
            s2map[s2.charAt(i) - 'a']--;
        }

        return matches(s1map, s2map);
    }

    private static boolean matches(int[] s1map, int[] s2map) {
        for (int i = 0; i < 26; i++) {
            if (s1map[i] != s2map[i]) {
                return false;
            }
        }
        return true;
    }
}

