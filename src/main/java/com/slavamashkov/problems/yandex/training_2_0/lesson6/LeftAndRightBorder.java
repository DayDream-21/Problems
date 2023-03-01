package com.slavamashkov.problems.yandex.training_2_0.lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class LeftAndRightBorder {
    static class Answer {
        int left;
        int right;

        public Answer(int left, int right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return left + " " + right;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Answer answer = (Answer) o;
            return left == answer.left && right == answer.right;
        }

        @Override
        public int hashCode() {
            return Objects.hash(left, right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr_ints = new int[n];

        for (int i = 0; i < n; i++) {
            arr_ints[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] arr_query = new int[m];

        for (int i = 0; i < m; i++) {
            arr_query[i] = scanner.nextInt();
        }

        List<Answer> answers = getLeftAndRightBorders(arr_ints, arr_query);

        for (Answer a : answers) {
            System.out.println(a);
        }
    }

    public static List<Answer> getLeftAndRightBorders(int[] arr, int[] queries) {
        List<Answer> answers = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            answers.add(new Answer(
                    getFirst(arr, queries[i]),
                    getLast(arr, queries[i]))
            );
        }

        return answers;
    }

    public static int getFirst(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        int index = 0;
        boolean flag = false;

        while (l <= r) {
            int m = (l + r) / 2;

            if (arr[m] == target) {
                index = m;
                r = m - 1;
                flag = true;
            } else if (arr[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return flag ? index + 1 : index;
    }

    public static int getLast(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        int index = 0;
        boolean flag = false;

        while (l <= r) {
            int m = (l + r) / 2;

            if (arr[m] == target) {
                index = m;
                l = m + 1;
                flag = true;
            } else if (arr[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return flag ? index + 1 : index;
    }
}
