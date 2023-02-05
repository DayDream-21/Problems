package com.slavamashkov.problems.tinkoff.tinkoff_19_12_2022;

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        // check if the total value in all currencies is divisible by the GCD of a, b, and c
        int gcd = gcd(a, b, c);
        int count = (x * a + y * b + z * c) % gcd == 0 ? 1 : 0;

        System.out.println(gcd);
    }

    // helper function to compute the GCD of three integers
    private static int gcd(int a, int b, int c) {
        return gcd(gcd(a, b), c);
    }

    // helper function to compute the GCD of two integers
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
