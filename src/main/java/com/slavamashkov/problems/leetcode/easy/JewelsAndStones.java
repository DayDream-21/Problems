package com.slavamashkov.problems.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * <h3>771. Jewels and Stones</h3>
 *
 * <p>You're given strings {@code jewels} representing the types of {@code stones}
 * that are jewels, and stones representing the stones you have. Each character
 * in {@code stones} is a type of stone you have. You want to know how many of
 * the stones you have are also jewels.</p>
 *
 * <p> Letters are case-sensitive, so  is considered a different type of stone from {@code "A"}.</p>
 * */

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(findJewels(jewels, stones));
        System.out.println(oneLineFindJewels(jewels, stones));
    }

    protected static int findJewels(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }

        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    protected static int oneLineFindJewels(String jewels, String stones) {
        return stones.replaceAll("[^" + jewels + "]", "").length();
    }
}
