package com.slavamashkov.problems.leetcode.easy;

import java.util.Arrays;

/**
 * <h3>733. Flood Fill</h3>
 *
 * <p>An image is represented by an {@code m x n} integer grid {@code image} where {@code image[i][j]} represents
 * the pixel value of the image.</p>
 *
 * <p>You are also given three integers {@code sr}, {@code sc}, and {@code newColor}. You should perform a <b>flood
 * fill</b> on the image starting from the pixel {@code image[sr][sc]}.</p>
 *
 * <p>To perform a <b>flood fill</b>, consider the starting pixel, plus any pixels connected <b>4-directionally</b>
 * to the starting pixel of the same color as the starting pixel, plus any pixels connected <b>4-directionally</b>
 * to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with
 * {@code newColor}.</p>
 *
 * <p>Return <i>the modified image after performing the flood fill</i>.</p>
 */

public class FloodFill {
    public static void main(String[] args) {
        int[][] image1 = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr1 = 1;
        int sc1 = 1;
        int newColor1 = 2;

        System.out.println(Arrays.deepToString(floodFill(image1, sr1, sc1, newColor1)));

        int[][] image2 = {
                {0, 0, 0},
                {0, 0, 0}
        };
        int sr2 = 0;
        int sc2 = 0;
        int newColor2 = 2;

        System.out.println(Arrays.deepToString(floodFill(image2, sr2, sc2, newColor2)));
    }

    protected static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];

        if (color != newColor) {
            dfs(image, sr, sc, color, newColor);
        }

        return image;
    }

    private static void dfs(int[][] image, int row, int column, int color, int newColor) {
        // If color matches previous cell color
        if (image[row][column] == color) {
            // then change it by new color
            image[row][column] = newColor;

            // Check next row above util 0th row (row < 1)
            if (row >= 1) {
                dfs(image, row - 1, column, color, newColor);
            }
            // Check next columns to the left until 0th column (column < 1)
            if (column >= 1) {
                dfs(image, row, column - 1, color, newColor);
            }
            // Check next row below util nth row (row + 1 >= rows amount)
            if ((row + 1) < image.length) {
                dfs(image, row + 1, column, color, newColor);
            }
            // Check next columns to the right until nth column (column + 1)
            if ((column + 1) < image[0].length) {
                dfs(image, row, column + 1, color, newColor);
            }
        }
    }
}
