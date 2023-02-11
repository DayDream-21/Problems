package com.slavamashkov.problems.yandex.training_2_0.lesson1;

import java.util.Scanner;

public class GuessDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        System.out.println(isCorrectDate(x, y, z));
    }

    public static int isCorrectDate(int x, int y, int z) {
        if ((x > 12 || y > 12) || (x == y)) {
            return 1;
        }
        return 0;
    }

    public static int isCorrectDateMine(int x, int y, int z) {
        boolean isEu = false;
        boolean isAm = false;

        // Check if date is in European format
        if ((x >= 1 && x <= 31) && (y >= 1 && y <= 12)) {
            isEu = true;
        }

        // Check if date is in American format
        if ((y >= 1 && y <= 31) && (x >= 1 && x <= 12)) {
            isAm = true;
        }

        if (isEu ^ isAm) {
            return 1;
        } else {
            return 0;
        }
    }
}
