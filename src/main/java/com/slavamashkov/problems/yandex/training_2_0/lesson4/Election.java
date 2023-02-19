package com.slavamashkov.problems.yandex.training_2_0.lesson4;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Election {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }

            String[] arr = line.split(" ");
            String name = arr[0];
            int votes = Integer.parseInt(arr[1]);

            map.put(name, map.getOrDefault(name, 0) + votes);
        }

        for (Map.Entry<String, Integer> e: map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
