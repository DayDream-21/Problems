package com.slavamashkov.problems.leetcode.medium;

import java.util.Arrays;

/**
 * <h3>1476. Subrectangle Queries</h3>
 *
 * <p>Implement the class {@code SubrectangleQueries} which receives a {@code rows x cols} rectangle as a matrix
 * of integers in the constructor and supports two methods:</p>
 *
 * <p>1. {@code updateSubrectangle(int row1, int col1, int row2, int col2, int newValue)}</p>
 *  <ul>
 *      <li>Updates all values with {@code newValue} in the subrectangle whose upper left coordinate
 *      is {@code (row1,col1)} and bottom right coordinate is {@code (row2,col2)}.</li>
 *  </ul>
 *
 * <p>2. {@code getValue(int row, int col)}</p>
 *  <ul>
 *      <li>Returns the current value of the coordinate {@code (row,col)} from the rectangle.</li>
 *  </ul>
 */

public class SubrectangleQueries {
    int[][] rectangle;

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i < row2 + 1; i++) {
            for (int j = col1; j < col2 + 1; j++) {
                rectangle[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return rectangle[row][col];
    }

    public static void main(String[] args) {
        int[][] rectangle = {
                {1, 2, 1},
                {4, 3, 4},
                {3, 2, 1},
                {1, 1, 1},
        };

        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(rectangle);
        System.out.println(subrectangleQueries.getValue(0, 2));
        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);

        System.out.println(Arrays.deepToString(rectangle));
    }
}

