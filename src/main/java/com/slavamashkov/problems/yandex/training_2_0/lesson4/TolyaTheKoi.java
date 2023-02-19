package com.slavamashkov.problems.yandex.training_2_0.lesson4;

import java.util.*;

public class TolyaTheKoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Map<Long, Long> colorSum = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long color = scanner.nextLong();
            long value = scanner.nextLong();
            colorSum.put(color, colorSum.getOrDefault(color, 0L) + value);
        }

        List<Long> sortedColors = new ArrayList<>(colorSum.keySet());
        Collections.sort(sortedColors);
        for (long color : sortedColors) {
            System.out.println(color + " " + colorSum.get(color));
        }
    }
}
