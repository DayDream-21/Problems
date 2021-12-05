package com.slavamashkov.problems;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        StringBuilder sb = new StringBuilder(prefix);

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(sb.toString())) {
                sb.deleteCharAt(sb.length() - 1);
                if (sb.isEmpty()) return "";
            }
        }
        return sb.toString();
    }
}
