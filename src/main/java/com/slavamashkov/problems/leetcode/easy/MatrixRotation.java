package com.slavamashkov.problems.leetcode.easy;

import java.util.Arrays;

/**
 * <h3>1886. Determine Whether Matrix Can Be Obtained By Rotation</h3>
 *
 * <p>Given two {@code n x n} binary matrices {@code mat} and {@code target}, return {@code true} if it is possible
 * to make {@code mat} equal to {@code target} by <b>rotating</b> mat in <b>90-degree increments</b>, or {@code false}
 * otherwise.</p>
 */

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

        int[][] mat3 = {
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1}
        };

        int[][] tar3 = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        System.out.println(findRotation(mat1, tar1));
        System.out.println(findRotation(mat2, tar2));
        System.out.println(findRotation(mat3, tar3));
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
        int n = mat.length;

        // Step 1 - Transpose Matrix (turn rows to columns)
        // [[1, 2, 3],    [[1, 4, 7],
        //  [4, 5, 6], ->  [2, 5, 8],
        //  [7, 8, 9]]     [3, 6, 9]]
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Step 2 - Flip Horizontally (moving to center swap pair of columns)
        // [[1, 4, 7],    [[7, 4, 1],
        //  [2, 5, 8], ->  [8, 5, 2],
        //  [3, 6, 9]]     [9, 6, 3]]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n / 2); j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n - 1 - j];
                mat[i][n - 1 - j] = temp;
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
