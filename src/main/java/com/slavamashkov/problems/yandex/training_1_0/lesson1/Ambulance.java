package com.slavamashkov.problems.yandex.training_1_0.lesson1;

import java.util.Scanner;

public class Ambulance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k1 = scanner.nextInt(); // номер квартиры 1
        int m = scanner.nextInt(); // кол-во этажей
        int k2 = scanner.nextInt(); // номер квартиры 2
        int p2 = scanner.nextInt(); // номер подъезда 2
        int n2 = scanner.nextInt(); // номер этажа 2

        new Ambulance().findFlatFloorNumber(k1, m, k2, p2, n2);

        scanner.close();
    }

    public void findFlatFloorNumber(int k1, int m, int k2, int p2, int n2) {
        int f2 = (p2 - 1) * m + n2;

        if (f2 == 1) {
            if (k1 <= k2) {
                System.out.println("1 1");
            } else if (m == 1) {
                System.out.println("0 1");
            } else {
                System.out.println("0 0");
            }
        } else {
            int on_f_max = (k2 + f2 - 2) / (f2 - 1) - 1;
            int on_f_min = (k2 + f2 - 1) / f2;

            if (on_f_max < on_f_min) {
                System.out.println("-1 -1");
            } else {
                int f_1_min = (k1 - 1) / on_f_max + 1;
                int f_1_max = (k1 - 1) / on_f_min + 1;

                int p_1_min = (f_1_min - 1) / m + 1;
                int p_1_max = (f_1_max - 1) / m + 1;

                int n_1_min = (f_1_min - 1) % m + 1;
                int n_1_max = (f_1_max - 1) % m + 1;

                if (p_1_min == p_1_max && n_1_min == n_1_max) {
                    System.out.println("" + p_1_min + " " + n_1_min);
                } else if (p_1_min == p_1_max) {
                    System.out.println("" + p_1_min + " " + 0);
                } else if (n_1_min == n_1_max) {
                    System.out.println("" + 0 + " " + n_1_min);
                }
            }
        }
    }
}


