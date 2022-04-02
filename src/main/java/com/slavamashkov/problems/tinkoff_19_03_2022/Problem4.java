package com.slavamashkov.problems.tinkoff_19_03_2022;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        try {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());

            table(n);
        } catch (Exception e) {
            System.err.println("Error:" + e.getMessage());
        }
    }

    public static void table(int n) {
        int range = n / 2;
        char[][] charTable = new char[n][n];
        int pointer = 97;


        for (int i = 0; i < n; i++) {
            if (pointer == 97) {
                while (pointer < 122) {
                    pointer++;
                    System.out.print(pointer + " ");
                }
            } else if (pointer >= 122) {
                while (pointer > 97) {
                    pointer--;
                    System.out.print(pointer + " ");
                }
            }
        }

        //printTable(charTable);
    }

    private static void printTable(char[][] charTable) {
        for (int i = 0; i < charTable.length; i++) {
            if (i > 0) {
                System.out.println();
            }
            for (int j = 0; j < charTable.length; j++) {
                System.out.print(charTable[i][j]);
            }
        }
    }
}
