package com.slavamashkov.problems.tinkoff.tinkoff_18_02_2022;


import java.util.Scanner;

public class Memes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        System.out.println(solution(n, m));
    }

    public static String solution(int n, int m) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < m + n; i++) {
            if (i % 2 == 0) {
                stringBuilder.append("X");
            } else {
                stringBuilder.append("Y");
            }
        }

        return stringBuilder.toString();
    }
}
