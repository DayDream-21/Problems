package com.slavamashkov.problems.tinkoff.tinkoff_19_03_2022;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem5 {
    public static void main(String[] args) {
        try {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            int k = Integer.parseInt(br.readLine());

            System.out.println(beautiful(n, k));
        } catch (Exception e) {
            System.err.println("Error:" + e.getMessage());
        }
    }

    public static int beautiful(int n, int k) {
        return 1;
    }

}
