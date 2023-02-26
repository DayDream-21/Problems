package com.slavamashkov.problems.yandex.training_2_0.lesson5;

import java.util.*;

public class ComputersForEveryone {
    private static int[][] readAndEnum(Scanner scanner) {
        String[] str = scanner.nextLine().split(" ");
        int[][] x = new int[str.length][2];

        for (int i = 0; i < str.length; i++) {
            x[i][0] = Integer.parseInt(str[i]);
            x[i][1] = i + 1;
        }

        Arrays.sort(x, Comparator.comparingInt(a -> a[0]));
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        int[][] x = readAndEnum(sc);
        int[][] y = readAndEnum(sc);
        int ynum = 0;
        int[] ans = new int[n+1];
        int cnt = 0;

        for (int[] xi : x) {
            int pupils = xi[0];
            int xnum = xi[1];
            while (ynum < y.length && y[ynum][0] < pupils + 1) {
                ynum++;
            }
            if (ynum == y.length) {
                break;
            }
            ans[xnum] = y[ynum][1];
            ynum++;
            cnt++;
        }
        System.out.println(cnt);
        for (int i = 1; i <= n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
