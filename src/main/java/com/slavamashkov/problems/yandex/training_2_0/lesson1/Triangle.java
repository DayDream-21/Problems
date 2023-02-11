package com.slavamashkov.problems.yandex.training_2_0.lesson1;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(findLocation(d, x, y));
    }

    /**
     * @param d длина катета треугольника ABC, A (0,0), B (d,0), C (0,d)
     * @param x координата точки по x
     * @param y координата точки по y
     * @return Если точка лежит внутри, на стороне треугольника или совпадает
     * с одной из вершин, то выводится число 0. Если точка лежит вне треугольника,
     * то выводится вершина треугольника, к которой она расположена ближе
     * всего (1 – к вершине A, 2 – к B, 3 – к C)
     */
    public static int findLocation(int d, int x, int y) {
        if (x >= 0 && y >= 0 && x + y <= d) {
            return 0;
        } else {
            double[] dist = {
                    euclidDist(x, y, 0, 0),
                    euclidDist(x, y, d, 0),
                    euclidDist(x, y, 0, d)
            };

            int minIndex = 0;
            double minDist = dist[0];
            for (int i = 1; i < dist.length; i++) {
                if (dist[i] < minDist) {
                    minIndex = i;
                    minDist = dist[i];
                }
            }
            return minIndex + 1;
        }
    }

    private static double euclidDist(double x1, double y1, double x2, double y2) {
        return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
    }
}
