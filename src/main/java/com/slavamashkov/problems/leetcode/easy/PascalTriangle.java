package com.slavamashkov.problems.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        for (List<Integer> list : generate(10)) {
            System.out.println(list);
        }

    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outerList = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(1);
        secondRow.add(1);

        if (numRows == 1) {
            outerList.add(firstRow);
            return outerList;
        } else if (numRows == 2) {
            outerList.add(firstRow);
            outerList.add(secondRow);
        } else {
            outerList.add(firstRow);
            outerList.add(secondRow);

            for (int i = 1; i < numRows - 1; i++) {
                List<Integer> innerList = new ArrayList<>();
                innerList.add(1);
                for (int j = 1; j < i + 1; j++) {
                    innerList.add(outerList.get(i).get(j) + outerList.get(i).get(j - 1));
                }
                innerList.add(1);
                outerList.add(innerList);
            }

        }

        return outerList;
    }
}
