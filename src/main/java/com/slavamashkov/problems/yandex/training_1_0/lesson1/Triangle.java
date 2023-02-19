package com.slavamashkov.problems.yandex.training_1_0.lesson1;

public class Triangle {
    public void isTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
