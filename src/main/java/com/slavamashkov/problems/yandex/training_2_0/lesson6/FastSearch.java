package com.slavamashkov.problems.yandex.training_2_0.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FastSearch {
    static class Query {
        int left;
        int right;

        public Query(int left, int right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "[" + left + ", " + right + "]";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        List<Query> queries = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            queries.add(new Query(scanner.nextInt(), scanner.nextInt()));
        }

        int[] answer = numbersInRanges(arr, queries);
        StringBuilder sb = new StringBuilder();

        for (int i : answer) {
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    public static int[] numbersInRanges(int[] arr, List<Query> queries) {
        int[] ans = new int[queries.size()];
        Arrays.sort(arr);
        int i = 0;

        for (Query q : queries) {
            int first_left = getLeftIndex(arr, q.left);
            int last_right = getRightIndex(arr, q.right);

            ans[i] = last_right - first_left + 1;
            i++;
        }

        return ans;
    }

    public static int getLeftIndex(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        int index = -1;

        while (l <= r) {
            int m = (l + r) / 2;

            if (arr[m] == target) {
                r = m - 1;
            } else if (arr[m] < target) {
                index = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return index + 1;
    }

    public static int getRightIndex(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        int index = -1;

        while (l <= r) {
            int m = (l + r) / 2;

            if (arr[m] == target) {
                index = m;
                l = m + 1;
            } else if (arr[m] < target) {
                index = m;
                l = m + 1;
            } else {
                index = m - 1;
                r = m - 1;
            }
        }

        return index;
    }
}
