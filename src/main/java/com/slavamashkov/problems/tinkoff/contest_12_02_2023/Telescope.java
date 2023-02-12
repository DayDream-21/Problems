package com.slavamashkov.problems.tinkoff.contest_12_02_2023;

import java.util.*;

public class Telescope {
    public static int minTelescopes(int n, int m, int k, int[] p, int[][] observations) {
        HashMap<Integer, Set<Integer>> modes = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int mode = p[i];
            if (!modes.containsKey(mode)) {
                modes.put(mode, new HashSet<>());
            }
            modes.get(mode).add(i + 1);
        }
        int switches = 0;
        for (int[] observation : observations) {
            int a = observation[0];
            int b = observation[1];
            int modeA = p[a - 1];
            int modeB = p[b - 1];
            if (modeA != modeB) {
                switches++;
                modes.get(modeA).remove(a);
                modes.get(modeB).remove(b);

                if (modes.containsKey(modeA)) {
                    modes.get(modeA).remove(a);
                    if (modes.get(modeA).isEmpty()) {
                        modes.remove(modeA);
                    }
                }
                if (modes.containsKey(modeB)) {
                    modes.get(modeB).remove(b);
                    if (modes.get(modeB).isEmpty()) {
                        modes.remove(modeB);
                    }
                }

                int mode = modeA;

                if (modes.containsKey(modeA) && modes.get(modeA).size() > modes.get(modeB).size()) {
                    mode = modeB;
                }

                if (!modes.containsKey(mode)) {
                    modes.put(mode, new HashSet<>());
                }

                modes.get(mode).add(a);
                modes.get(mode).add(b);
            }
        }
        return switches;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        int[][] observations = new int[m][2];
        for (int i = 0; i < m; i++) {
            observations[i][0] = sc.nextInt();
            observations[i][1] = sc.nextInt();
        }
        int result = minTelescopes(n, m, k, p, observations);
        System.out.println(result);
    }
}
