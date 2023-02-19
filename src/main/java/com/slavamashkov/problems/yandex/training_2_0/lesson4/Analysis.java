package com.slavamashkov.problems.yandex.training_2_0.lesson4;

import java.util.*;

public class Analysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.isEmpty()) {
                break;
            }

            String[] arr = line.split(" ");

            for (String key : arr) {
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }

        map.entrySet()
            .stream()
            .sorted(Comparator
                    .comparing((Map.Entry<String, Integer> e) -> e.getValue())
                    .reversed()
                    .thenComparing(Map.Entry::getKey))
            .forEach(e -> System.out.println(e.getKey()));
    }
}
