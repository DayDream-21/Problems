package com.slavamashkov.problems.tinkoff.tinkoff_19_12_2022;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        String colors = scanner.nextLine();
        scanner.close();

        System.out.println(countUglyWords(n, name, colors));
    }

    public static int countUglyWords(int n, String name, String colors) {
        int uglyWordCount = 0;

        for (int i = 1; i < n; i++) {
            boolean isUgly = false;

            if (name.charAt(i) != ' ' && colors.charAt(i) == colors.charAt(i - 1)) {
                isUgly = true;
            } else if (name.charAt(i) == ' ') {
                n = n + 1;
            }

            if (isUgly) {
                uglyWordCount++;
            }
        }

        return uglyWordCount;
    }
}
