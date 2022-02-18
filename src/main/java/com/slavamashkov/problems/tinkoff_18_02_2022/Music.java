package com.slavamashkov.problems.tinkoff_18_02_2022;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        while (true) {
            String nextLine = scanner.nextLine();
            if (nextLine.equals("")) break;
            list.add(Integer.valueOf(nextLine));
        }

        System.out.println(list);

        samplePosition(Integer.parseInt(input1[0]), Integer.parseInt(input1[1]), Integer.parseInt(input1[2]), list);
    }

    public static void samplePosition(int height, int width, int n, List<Integer> sl) {
        Integer[] samplesLength = sl.toArray(new Integer[0]);
        int[] space = new int[height];
        Arrays.fill(space, width);

        for (int sampleNum = 0; sampleNum < n; sampleNum++) {
            for (int i = 0; i < space.length; ) {
                if (space[i] >= samplesLength[sampleNum]) {
                    space[i] = space[i] - samplesLength[sampleNum];
                    System.out.println(i + 1);
                    break;
                } else {
                    i++;
                }
                if (i == space.length) {
                    System.out.println(-1);
                }
            }
        }
    }
}


