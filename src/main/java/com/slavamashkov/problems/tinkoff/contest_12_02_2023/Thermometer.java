package com.slavamashkov.problems.tinkoff.contest_12_02_2023;

import java.util.Scanner;

public class Thermometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int currentTemperature = 0;
        int minTemperature = 0;
        for (int i = 0; i < n; i++) {
            int change = sc.nextInt();
            currentTemperature += change;
            String observation = sc.next();
            if (observation.equals("0+") && currentTemperature < 0) {
                minTemperature = Math.max(minTemperature, -currentTemperature);
                currentTemperature = 0;
            }
        }
        if (minTemperature > 0) {
            System.out.println("inf");
        } else {
            System.out.println(Math.max(currentTemperature, minTemperature));
        }
    }
}
