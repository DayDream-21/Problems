package com.slavamashkov.problems.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        /*for (List<Integer> list : generateNaive(10)) {
            System.out.println(list);
        }*/

        /*for (List<Integer> list : generateSmart(10)) {
            System.out.println(list);
        }*/

        System.out.println(getRow(0));
    }

    private static List<List<Integer>> generateNaive(int numRows) {
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

    private static List<List<Integer>> generateSmart(int numRows) {
        List<List<Integer>> outerList = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            outerList.add(new ArrayList<>(row));
        }

        return outerList;
    }

    private static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        for (int i = 0; i < rowIndex + 1; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }

        }

        return row;
    }
}
