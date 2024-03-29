package com.slavamashkov.problems.leetcode.easy;

import java.util.Objects;

/**
 * <h3>28. Implement strStr()</h3>
 *
 * <p>Implement {@code strStr()}.</p>
 *
 * <p>Return the index of the first occurrence of needle in haystack, or {@code -1} if {@code needle} is not part
 * of {@code haystack}.</p>
 *
 * <p><b>Clarification:</b></p>
 *
 * <p>What should we return when {@code needle} is an empty string? This is a great question to ask during an
 * interview.</p>
 *
 * <p>For the purpose of this problem, we will return 0 when {@code needle} is an empty string. This is consistent
 * to C's {@code strstr()} and Java's {@code indexOf()}.</p>
 */

public class FirstOccurrence {
    public static void main(String[] args) {
        System.out.println(strStrSlow("abdabc", "bc"));
        System.out.println(strStrSlow("aaab", "ba"));

        System.out.println(strStrFast("abdabc", "bc"));
        System.out.println(strStrFast("aaab", "ba"));

        System.out.println(strStrKPM("abbaabbab", "bbab"));
        System.out.println(strStrKPM("abbaab", "ba"));
    }

    // Time complexity O(n * m), where
    // n - length of haystack
    // m - length of needle
    private static int strStrSlow(String haystack, String needle) {
        int i, j, k;

        if (Objects.equals(needle, "")) {
            return 0;
        }

        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (k = 0; k < haystack.length(); k++) {
            i = k;
            j = 0;

            while (i < haystack.length() && j < needle.length()) {
                if (haystack.charAt(i) == needle.charAt(j)) {
                    i++;
                    j++;
                } else {
                    break;
                }

                if (j == needle.length()) {
                    return k;
                }
            }
        }

        return -1;
    }

    private static int strStrFast(String haystack, String needle) {
        if (Objects.equals(needle, "")) {
            return 0;
        }

        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.startsWith(needle, i)) {
                    return i;
                }
            }
        }

        return -1;
    }

    // Knuth–Morris–Pratt (KMP) Pattern Matching Substring Search
    private static int strStrKPM(String haystack, String needle) {
        int result = -1;

        if (Objects.equals(needle, "")) {
            return 0;
        }

        if (needle.length() > haystack.length()) {
            return -1;
        }

        // piArray initialization
        int i = 1;
        int j = 0;
        int[] piArray = new int[needle.length()];

        while (i < needle.length()) {
            if (needle.charAt(i) == needle.charAt(j)) {
                piArray[i] = j + 1;
                i++;
                j++;
            } else {
                if (j == 0) {
                    piArray[i] = 0;
                    i++;
                } else {
                    j = piArray[j - 1];
                }
            }
        }

        int k = 0;
        int l = 0;

        while (l < needle.length()) {
            if (haystack.charAt(k) == needle.charAt(l)) {
                k++;
                l++;

                if (l == needle.length()) {
                    result = k - l;
                }
            } else {
                if (l == 0) {
                    k++;
                    if (k == haystack.length() - 1) {
                        break;
                    }
                } else {
                    l = piArray[l - 1];
                }
            }
        }

        return result;
    }
}
