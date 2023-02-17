package com.slavamashkov.problems.yandex.training_2_0.lesson3;

import java.util.*;
import java.util.stream.Collectors;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> result = new HashSet<>();
        int max = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= max; i++) {
            result.add(i);
        }

        while (!scanner.hasNext("HELP")) {
            Set<Integer> ints = Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toSet());

            String answer = scanner.nextLine();

            if (answer.equals("YES")) {
                result.retainAll(ints);
            } else {
                ints.forEach(result::remove);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (Integer i : result) {
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}

