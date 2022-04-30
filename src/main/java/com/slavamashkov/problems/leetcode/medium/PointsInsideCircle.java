package com.slavamashkov.problems.leetcode.medium;

import java.util.*;

/**
 * <h3>1828. Queries on Number of Points Inside a Circle</h3>
 *
 * <p>You are given an array {@code points} where {@code points[i] = [xi, yi]} is the coordinates
 * of the {@code ith} point on a 2D plane. Multiple points can have the <b>same</b> coordinates.</p>
 *
 * <p>You are also given an array {@code queries} where {@code queries[j] = [xj, yj, rj]} describes
 * a circle centered at {@code (xj, yj)} with a radius of {@code rj}.</p>
 *
 * <p>For each query {@code queries[j]}, compute the number of points <b>inside</b> the {@code jth}
 * circle. Points <b>on the border</b> of the circle are considered <b>inside</b>.</p>
 *
 * <p>Return <i>an array</i> {@code answer}<i>, where</i> {@code answer[j]} <i>is the answer to
 * the</i> {@code jth} <i>query.</i></p>
 */

public class PointsInsideCircle {
    public static void main(String[] args) {
        int[][] points = {
                {1, 3},
                {3, 3},
                {5, 3},
                {2, 2}
        };

        int[][] queries = {
                {2, 3, 1},
                {4, 3, 1},
                {1, 1, 2}
        };

        System.out.println(Arrays.toString(countPoints(points, queries)));
    }

    protected static int[] countPoints(int[][] points, int[][] queries) {
        int sizeQuery = queries.length;

        int[] result = new int[sizeQuery];
        // For every circle check every point coordinates
        for (int i = 0; i < sizeQuery; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            int counter = 0;
            for (int[] point : points) { // If the coordinates satisfy the condition "(x - xi)^2 + (y - yi)^2 <= r^2"
                if (Math.pow((point[0] - x), 2) + Math.pow((point[1] - y), 2) <= Math.pow(queries[i][2], 2)) {
                    counter++; // Increment counter by 1
                }
            }
            result[i] = counter;
        }

        return result;
    }

    // This humongous code find all relational to circle center points coordinates
    private static void findAllRelationalCoordinates(int[][] points, int[][] queries) {
        Map<Integer, List<List<Integer>>> relationalCoordinatesMap = new HashMap<>();

        for (int i = 0; i < queries.length; i++) {
            List<List<Integer>> allRelationalPointsList = new ArrayList<>();
            for (int[] point : points) {
                List<Integer> relationalCoordinatesPointsList = new ArrayList<>();

                int relX = point[0] - queries[i][0];
                int relY = point[1] - queries[i][1];

                relationalCoordinatesPointsList.add(relX);
                relationalCoordinatesPointsList.add(relY);

                allRelationalPointsList.add(relationalCoordinatesPointsList);

                relationalCoordinatesMap.put(i, allRelationalPointsList);
            }
        }

        System.out.println(relationalCoordinatesMap);
    }

}
