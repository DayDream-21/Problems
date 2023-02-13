package com.slavamashkov.problems.yandex.training_2_0.lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(maxLengthSlow(list));
    }

    // 0 - офис
    // 1 - дом
    // 2 - магазин
    public static int maxLengthSlow(List<Integer> list) {
        if (list.size() == 2) {
            return 1;
        }

        int maxCount = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                int leftMin = 1;
                int rightMin = 1;

                int left_p = i - 1;
                boolean left_found = false;
                while (left_p >= 0) {
                    if (list.get(left_p) != 2) {
                        left_p--;
                        leftMin++;
                    } else {
                        left_found = true;
                        break;
                    }
                }

                int right_p = i + 1;
                boolean right_found = false;
                while (right_p < list.size()) {
                    if (list.get(right_p) != 2) {
                        right_p++;
                        rightMin++;
                    } else {
                        right_found = true;
                        break;
                    }
                }

                if (left_found && right_found) {
                    if (maxCount < Math.min(leftMin, rightMin)) {
                        maxCount = Math.min(leftMin, rightMin);
                    }
                } else if (left_found) {
                    if (maxCount < leftMin) {
                        maxCount = leftMin;
                    }
                } else if (right_found) {
                    if (maxCount < rightMin) {
                        maxCount = rightMin;
                    }
                }
            }
        }

        return maxCount;
    }
}
