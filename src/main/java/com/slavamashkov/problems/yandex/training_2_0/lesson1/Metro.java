package com.slavamashkov.problems.yandex.training_2_0.lesson1;

import java.util.Scanner;

public class Metro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        System.out.println(stations(n, i, j));
    }

    public static int stations(int n, int i, int j) {
        int clockwise = Math.abs(j - i) - 1;
        int counterclockwise = n - clockwise - 2;

        return Math.min(clockwise, counterclockwise);
    }
}


