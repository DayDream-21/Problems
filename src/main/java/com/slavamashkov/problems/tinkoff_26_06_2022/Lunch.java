package com.slavamashkov.problems.tinkoff_26_06_2022;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nk = sc.nextLine().split(" ");

        int availableAmount = Integer.parseInt(nk[0]);
        int unavailableAmount = Integer.parseInt(nk[1]);

        int[] dishFlavors = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] unavailableDishesNumbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(isBestDishAvailable(availableAmount, unavailableAmount, dishFlavors, unavailableDishesNumbers) ?
                "Yes" :
                "No");
    }

    private static boolean isBestDishAvailable(int availableAmount,
                                               int unavailableAmount,
                                               int[] dishFlavors,
                                               int[] unavailableDishesNumbers) {
        int bestDishIndex = getBestDishIndex(dishFlavors);

        for (int i = 0; i < availableAmount; i++) {
            for (int j = 0; j < unavailableDishesNumbers.length; j++) {
                int unavailableIndex = unavailableDishesNumbers[j];
                if (i == unavailableIndex) {
                    continue;
                } else {
                    if (i == bestDishIndex) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static int getBestDishIndex(int[] array) {
        int index = 0;
        int max = array[index];

        for (int i = 1; i < array.length; i++){
            if (array[i] >= max){
                max = array[i];
                index = i;
            }
        }
        return index;
    }
}
