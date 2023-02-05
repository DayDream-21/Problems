package com.slavamashkov.problems.yandex.contest_04_02_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int k = 0;
        int[][] trades = new int[4][2];
        int maxProfit = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                    k = 1;
                    trades[0][0] = i;
                    trades[0][1] = j;
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int profit = prices[j] - prices[i];
                if (profit < maxProfit) {
                    continue;
                }
                for (int m = j + 1; m < n - 1; m++) {
                    for (int p = m + 1; p < n; p++) {
                        int profit2 = prices[p] - prices[m];
                        if (profit + profit2 > maxProfit) {
                            maxProfit = profit + profit2;
                            k = 2;
                            trades[0][0] = i;
                            trades[0][1] = j;
                            trades[1][0] = m;
                            trades[1][1] = p;
                        }
                    }
                }
            }
        }

        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.println((trades[i][0] + 1) + " " + (trades[i][1] + 1));
        }
        sc.close();
    }
}