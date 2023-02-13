package com.slavamashkov.problems.yandex.training_2_0.lesson2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(createPalindrome(str));
    }

    public static int createPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        int count = 0;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                count++;
            }

            left++;
            right--;
        }

        return count;
    }
}
