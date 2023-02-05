package com.slavamashkov.problems.tinkoff.tinkoff_19_12_2022;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(maxTotalArea(n));
    }

    public static double maxTotalArea(int n) {
        return (n * Math.sin(2 * Math.PI / n)) / 2;
    }
}
