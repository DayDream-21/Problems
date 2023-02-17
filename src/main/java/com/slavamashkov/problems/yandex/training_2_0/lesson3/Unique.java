package com.slavamashkov.problems.yandex.training_2_0.lesson3;

import java.util.*;

public class Unique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        StringBuilder sb = new StringBuilder();
        Arrays.stream(findUnique(arr)).forEach(i -> {
            sb.append(i);
            sb.append(" ");
        });

        System.out.println(sb.toString().trim());
    }

    public static int[] findUnique(int[] arr) {
        Set<Integer> unique = new LinkedHashSet<>();
        Set<Integer> repeated = new HashSet<>();

        for (int i : arr) {
            if (!repeated.contains(i)) {
                unique.add(i);
                repeated.add(i);
            } else {
                unique.remove(i);
            }
        }

        return unique.stream().mapToInt(Integer::intValue).toArray();
    }
}
