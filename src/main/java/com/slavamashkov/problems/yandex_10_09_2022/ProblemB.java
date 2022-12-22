package com.slavamashkov.problems.yandex_10_09_2022;

import java.util.*;

public class ProblemB {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int discAmount = scanner.nextInt();
            String[][] disc = new String[discAmount][2];
            scanner.nextLine();
            for (int i = 0; i < discAmount; i++) {
                disc[i] = scanner.nextLine().split(",");
            }

            int pepAmount = scanner.nextInt();
            String[][] results = new String[pepAmount][4];
            scanner.nextLine();
            for (int i = 0; i < pepAmount; i++) {
                results[i] = scanner.nextLine().split(",");
            }

            solve(disc, results);
        }
    }

    private static void solve(String[][] disc, String[][] results) {
        List<String> namesOfParticipants = new ArrayList<>();

        for (int i = 0; i < disc.length; i++) {
            String discName = disc[i][0];
            for (int j = 0; j < results.length - 1; j++) {
                if (results[j][1].equals(discName)) {
                    if (Integer.parseInt(results[j][2]) > Integer.parseInt(results[j + 1][2]) &&
                        Integer.parseInt(disc[i][1]) > 1) {
                            namesOfParticipants.add(results[j][0]);
                            disc[i][1] = String.valueOf(Integer.parseInt(disc[i][1]) - 1);
                    }
                }
            }
        }

        System.out.println(namesOfParticipants);
    }
}
