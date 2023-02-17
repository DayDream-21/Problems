package com.slavamashkov.problems.yandex.training_2_0.lesson3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Meet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str_arr = scanner.nextLine().split(" ");

        Set<Integer> set = new HashSet<>();

        for (String s : str_arr) {
            int num = Integer.parseInt(s);

            if (set.contains(num)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
                set.add(num);
            }
        }
    }
}
