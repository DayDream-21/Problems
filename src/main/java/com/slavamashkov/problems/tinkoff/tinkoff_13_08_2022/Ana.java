package com.slavamashkov.problems.tinkoff.tinkoff_13_08_2022;

import java.util.*;

public class Ana {
    public static void main(String[] args) {
        List<Set<String>> teams = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int input1 = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < input1; i++) {
            Set<String> members = new HashSet<>();
            Collections.addAll(members, sc.nextLine().split(" "));
            teams.add(members);
        }

        System.out.println(find(teams));
    }

    private static int find(List<Set<String>> teams) {
        int maxWin = 1;

        for (int i = 0; i < teams.size() - 1; i++) {
            if (teams.get(i).containsAll(teams.get(i + 1))) {
                maxWin++;
            }
        }

        return maxWin;
    }
}
