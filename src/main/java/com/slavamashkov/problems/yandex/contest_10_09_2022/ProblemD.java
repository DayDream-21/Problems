package com.slavamashkov.problems.yandex.contest_10_09_2022;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] size = scanner.nextLine().split(" ");
        int n = Integer.parseInt(size[0]);
        int m = Integer.parseInt(size[1]);
        Character[][] plan = new Character[n][m];

        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                plan[i][j] = str.charAt(j);
            }
        }

        solve(plan);
    }

    private static void solve(Character[][] plan) {
        int n = plan.length;
        int m = plan[0].length;

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                if (plan[i][j] == '#') {
                    continue;
                } else if (plan[i][j] == 'S') {
                    continue;
                } else {
                    if (plan[i][j + 1] != '#') {
                        plan[i][j] = 'R';
                    } else if (plan[i][j - 1] != '#' ) {
                        plan[i][j] = 'L';
                    } else if (plan[i + 1][j] != '#' ) {
                        plan[i][j] = 'D';
                    } else if (plan[i - 1][j] != '#' ) {
                        plan[i][j] = 'U';
                    }
                }
            }
        }

        for (Character[] chars : plan) {
            System.out.println(Arrays.toString(chars));
        }
    }
}
