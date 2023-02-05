package com.slavamashkov.problems.tinkoff.tinkoff_19_03_2022;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1 {
    public static void main(String[] args) {
        try {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            System.out.println(isMore(a, b, n));
        } catch (Exception e) {
            System.err.println("Error:" + e.getMessage());
        }
    }

    public static String isMore(int a, int b, int n) {
        return (a / n) > (b / n) ? "Yes" : "No";
    }
}
