package com.slavamashkov.problems.tinkoff.tinkoff_19_12_2022;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number n
        int n = scanner.nextInt();

        // Calculate a and b
        int a = (n + 1) / 2;
        int b = n - a;

        // Output the pair of numbers a and b
        System.out.println(a + " " + b);
    }
}
