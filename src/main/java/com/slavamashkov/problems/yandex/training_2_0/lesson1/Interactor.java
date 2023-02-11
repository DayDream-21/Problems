package com.slavamashkov.problems.yandex.training_2_0.lesson1;

import java.util.Scanner;

public class Interactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt(); // код завершения задачи
        int i = scanner.nextInt(); // вердикт интерактора
        int c = scanner.nextInt(); // вердикт чекера
        System.out.println(totalVerdict(r, i, c));
    }

    public static int totalVerdict(int r, int i, int c) {
        if (i == 0) {
            if (r != 0) {
                return 3;
            } else {
                return c;
            }
        }

        if (i == 1) {
            return c;
        }

        if (i == 4) {
            if (r != 0) {
                return 3;
            } else {
                return 4;
            }
        }

        if (i == 6) {
            return 0;
        } else if (i == 7) {
            return 1;
        }

        return i;
    }
}
