package com.slavamashkov.problems;

import java.util.HashSet;
import java.util.Set;

public class FindSingle {
    public static void main(String[] args) {
        int[] arr = {9, 1, 2, 7, 5, 1, 7, 9, 2};

        System.out.println(findSingle(arr));
    }

    private static int findSingle(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }

        return set.stream().findFirst().get();
    }
}
