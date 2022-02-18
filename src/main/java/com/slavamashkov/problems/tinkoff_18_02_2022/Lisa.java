package com.slavamashkov.problems.tinkoff_18_02_2022;

import java.util.Scanner;

public class Lisa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }

        System.out.println(solution(n, arr));

    }

    public static int minIndex(int[] array) {
        int index = 0;
        int min = array[index];

        for (int i = 1; i < array.length; i++){
            if (array[i] <= min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int solution(int p, int[][] time) {
        int totalTime = 0;
        for (int i = 0; i < time.length; ) {
            int idx = minIndex(time[i]);
            if (idx == 0) {
                totalTime += time[i][idx];
                i++;
            } else if (idx == 1) {
                totalTime += time[i][idx];
                i += 2;
            } else {
                totalTime += time[i][idx];
                i += 3;
            }
        }

        return totalTime;
    }
}



