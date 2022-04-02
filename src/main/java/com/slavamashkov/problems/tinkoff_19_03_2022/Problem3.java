package com.slavamashkov.problems.tinkoff_19_03_2022;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem3 {
    public static void main(String[] args) {
        try {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));

            long n = Long.parseLong(br.readLine());

            System.out.println(zeros(n));
        } catch (Exception e) {
            System.err.println("Error:" + e.getMessage());
        }
    }

    public static int zeros(long n) {
        int x = 0;

        while (n % 10 == 0) {
            x++;
            n /= 10;
        }

        return x;
    }
}
