package com.slavamashkov.problems.tinkoff.tinkoff_18_02_2022;

import java.util.Scanner;

public class Crypto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input1 = sc.nextLine().split(" ");
        String input2 = sc.nextLine();

        int n = Integer.parseInt(input1[0]);
        int maxStep = Integer.parseInt(input1[1]);

        System.out.println(solution(n, maxStep, input2));
    }

    public static String solution(int n, int maxStep, String s) {
        String ans = "NO";
        String[] str = s.split("");
        int i = 0;
        while (i < n) {
            if (str[i + maxStep - 1].equals("1")) {
                i += maxStep - 1;
            } else if (str[i + maxStep - 1].equals("0")) {
                int step = maxStep - 1;
                while (step > 0) {
                    if (str[i + step].equals("1")) {
                        i += step;
                        break;
                    } else {
                        step--;
                    }
                }
                if (step == 0) {
                    return "NO";
                }
            }

            if (i == n - 1) {
                ans = "YES";
                return ans;
            }
        }

        return ans;
    }

}
