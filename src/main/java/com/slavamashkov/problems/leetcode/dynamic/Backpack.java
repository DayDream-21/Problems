package com.slavamashkov.problems.leetcode.dynamic;

import java.util.Arrays;

public class Backpack {
    public static void main(String[] args) {
        double[] itemValue = {1.5, 3.0, 2.0};
        int[] itemWeight = {1, 4, 3};

        int backpackMaxWeight = 4;

        System.out.println(backpackMaxValue(backpackMaxWeight, itemValue, itemWeight));
    }

    private static double backpackMaxValue(int backpackMaxWeight, double[] itemValue, int[] itemWeight) {
        int items = itemValue.length;
        // Оставляем место для крайнего левого столбца и верхней строчки, они будут заполнены нулями
        double[][] table = new double[items + 1][backpackMaxWeight + 1];

        for (int i = 0; i <= items; i++) {
            for (int w = 0; w <= backpackMaxWeight; w++) {
                if (i == 0 || w == 0) {
                    table[i][w] = 0; // Заполняем нулями крайний левый столбец и верхнюю строчку
                } else if (itemWeight[i - 1] <= w) {
                    table[i][w] = Math.max(itemValue[i - 1] + table[i - 1][w - itemWeight[i - 1]], table[i - 1][w]);
                } else {
                    table[i][w] = table[i - 1][w];
                }
            }
        }

        System.out.println(Arrays.deepToString(table));

        return table[items][backpackMaxWeight];
    }
}
