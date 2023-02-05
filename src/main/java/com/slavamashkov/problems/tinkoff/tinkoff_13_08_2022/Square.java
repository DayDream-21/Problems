package com.slavamashkov.problems.tinkoff.tinkoff_13_08_2022;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input1 = sc.nextLine().split(" ");
        String[] input2 = sc.nextLine().split(" ");

        System.out.println(calculate(input1, input2));
    }

    private static int calculate(String[] office1, String[] office2) {
        int[] x_values = {
                Integer.parseInt(office1[0]),
                Integer.parseInt(office1[2]),
                Integer.parseInt(office2[0]),
                Integer.parseInt(office2[2])
        };

        IntSummaryStatistics x_stat = Arrays.stream(x_values).summaryStatistics();
        int x_max = x_stat.getMax();
        int x_min = x_stat.getMin();
        int x_difference = x_max - x_min;

        int[] y_values = {
                Integer.parseInt(office1[1]),
                Integer.parseInt(office1[3]),
                Integer.parseInt(office2[1]),
                Integer.parseInt(office2[3])
        };

        IntSummaryStatistics y_stat = Arrays.stream(y_values).summaryStatistics();
        int y_max = y_stat.getMax();
        int y_min = y_stat.getMin();
        int y_difference = y_max - y_min;

        return (int) Math.pow(Math.max(x_difference, y_difference), 2);
    }
}
