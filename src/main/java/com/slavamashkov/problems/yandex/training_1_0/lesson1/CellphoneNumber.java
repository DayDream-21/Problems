package com.slavamashkov.problems.yandex.training_1_0.lesson1;

import java.util.Scanner;

public class CellphoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String newNumber = sc.nextLine();
        newNumber = normalizeNumber(newNumber);
        String[] numbers = new String[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = sc.nextLine();
            numbers[i] = normalizeNumber(numbers[i]);
        }
        for (String number : numbers) {
            if (number.equals(newNumber)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    private static String normalizeNumber(String number) {
        number = number.replaceAll("[()-]", "");
        if (number.startsWith("+7")) {
            number = number.substring(2);
        } else if (number.startsWith("8")) {
            number = number.substring(1);
        } else if (number.length() == 7) {
            number = "495" + number;
        }
        return number;
    }
}
