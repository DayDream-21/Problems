package com.slavamashkov.problems.yandex.training_2_0.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            nums.add(num);
        }

        System.out.println(countMax(nums));
    }

    public static int countMax(List<Integer> list) {
        int max = 0;
        int count = 0;

        for (int n : list) {
            if (n > max) {
                max = n;
                count = 1;
            } else if (n == max) {
                count++;
            }
        }
        return count;
    }
}
