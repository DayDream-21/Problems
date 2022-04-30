package com.slavamashkov.problems.leetcode.medium;

import java.util.Stack;

/**
 * <h3>695. Max Area of Island</h3>
 *
 * <p>You are given an {@code m x n} binary matrix {@code grid}. An island is a group of {@code 1}'s (representing
 * land) connected <b>4-directionally</b> (horizontal or vertical.) You may assume all four edges of the grid are
 * surrounded by water.</p>
 *
 * <p>The <b>area</b> of an island is the number of cells with a value {@code 1} in the island.</p>
 *
 * <p>Return <i>the maximum <b>area</b> of an island in</i> {@code grid}. If there is no island, return {@code 0}.</p>
 */

public class MaxAreaOfIsland {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
        };

        System.out.println(maxAreaOfIsland(grid)); // 6
    }

    public static int maxAreaOfIsland(int[][] grid) {
        boolean[][] seen = new boolean[grid.length][grid[0].length];

        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        int ans = 0;
        for (int r0 = 0; r0 < grid.length; r0++) {
            for (int c0 = 0; c0 < grid[0].length; c0++) {
                if (grid[r0][c0] == 1 && !seen[r0][c0]) {
                    int shape = 0;
                    Stack<int[]> stack = new Stack<>();
                    stack.push(new int[] {r0, c0});
                    seen[r0][c0] = true;
                    while (!stack.empty()) {
                        int[] node = stack.pop();
                        int r = node[0];
                        int c = node[1];

                        shape++;

                        for (int k = 0; k < 4; k++) {
                            int nr = r + dr[k];
                            int nc = c + dc[k];
                            if (0 <= nr && nr < grid.length &&
                                    0 <= nc && nc < grid[0].length &&
                                    grid[nr][nc] == 1 &&
                                    !seen[nr][nc]) {
                                stack.push(new int[]{nr, nc});
                                seen[nr][nc] = true;
                            }
                        }
                    }
                    ans = Math.max(ans, shape);
                }
            }
        }
        return ans;
    }
}
