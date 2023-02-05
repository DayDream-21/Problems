package com.slavamashkov.problems.other;

import java.util.Stack;

public class TwoArraysSum {
    public static void main(String[] args) {
        int[] arr1 = {-1, 3, 8, 2, 9, 5};
        int[] arr2 = {4, 1, 2, 10, 5, 20};
        int target = 24;
        int range = Integer.MAX_VALUE;
        Stack<Pair> pairs = new Stack<>();

        for (int k : arr1) {
            for (int i : arr2) {
                int sum = k + i;
                int newRange = target - sum;

                if (range >= Math.abs(newRange)) {
                    if (!pairs.empty() && range != Math.abs(newRange)) {
                        pairs.pop();
                    }
                    range = Math.abs(newRange);
                    pairs.push(new Pair(k, i));
                }
            }
        }

        for(Pair p : pairs) {
            p.showPair();
        }
    }
}

class Pair {
    int a, b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void showPair() {
        System.out.println(a + " " + b);
    }
}
