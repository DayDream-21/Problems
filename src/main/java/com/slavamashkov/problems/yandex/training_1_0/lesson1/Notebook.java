package com.slavamashkov.problems.yandex.training_1_0.lesson1;

import java.util.Scanner;

public class Notebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int minE = Integer.MAX_VALUE;
        int minF = Integer.MAX_VALUE;
        int[] sizes = new int[]{a, b, c, d};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    continue;
                }
                int curE = sizes[i] + sizes[j];
                int curF = Math.max(sizes[i], sizes[j]);
                if (curE * curF < minE * minF) {
                    minE = curE;
                    minF = curF;
                }
            }
        }
        System.out.println(minE + " " + minF);
    }
}
