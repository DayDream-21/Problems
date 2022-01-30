package com.slavamashkov.problems.leetcode.easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        // Take first word and create StringBuilder object from it
        StringBuilder prefix = new StringBuilder(strs[0]);

        // Begin with the second word
        for (int i = 1; i < strs.length; i++) {
            // Check if the selected word starts with a prefix
            while (!strs[i].startsWith(prefix.toString())) {
                // If not, then cut off the last letter of this prefix
                prefix.deleteCharAt(prefix.length() - 1);
                // If we reached the end
                if (prefix.isEmpty()) {
                    return "No common prefix";
                }
            }
        }
        return prefix.toString();
    }
}
