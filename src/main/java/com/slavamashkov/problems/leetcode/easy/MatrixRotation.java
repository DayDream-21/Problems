package com.slavamashkov.problems.leetcode.easy;

/*
* Given two n x n binary matrices mat and target,
* return true if it is possible to make mat equal
* to target by rotating mat in 90-degree increments,
* or false otherwise.
* */

import java.util.Arrays;

public class MatrixRotation {
    public static void main(String[] args) {
        int[][] mat1 = {
                {0, 1},
                {1 ,1}
        };

        int[][] tar1 = {
                {1, 0},
                {0, 1}
        };

        int[][] mat2 = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };

        int[][] tar2 = {
                {1, 1, 1},
                {0, 1, 0},
                {0, 0, 0}
        };

        System.out.println(findRotation(mat1, tar1));
        System.out.println(findRotation(mat2, tar2));
    }

    private static boolean findRotation(int[][] mat, int[][] target) {
        int count = 0;

        do {
            if (isSimilar(mat, target)) {
                return true;
            } else {
                rotate(mat);
                count++;
            }
        } while (count != 4);

        return false;
    }

    private static boolean isSimilar(int[][] mat, int[][] target) {
        return Arrays.deepEquals(mat, target);
    }

    private static void rotate(int[][] mat) {
        for (int i = 0, j = mat.length - 1; i < j; ++i, --j) {
            int[] temp = mat[i];
            mat[i] = mat[j];
            mat[j] = temp;
        }

        for (int i = 0; i < mat.length; ++i) {
            for (int j = i + 1; j < mat.length; ++j) {
                final int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    
    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
