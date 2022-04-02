package com.slavamashkov.problems.tinkoff_19_03_2022;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problem2 {
    public static void main(String[] args) {
        try {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));
            String ab = br.readLine();
            String ac = br.readLine();
            String bc = br.readLine();

            order(ab, ac, bc);
        } catch (Exception e) {
            System.err.println("Error:" + e.getMessage());
        }
    }

    public static void order(String ab, String ac, String bc) {
        if (ab.equals("=")) {
            switch (ac) {
                case ">" -> System.out.println("cab");
                case "<", "=" -> System.out.println("abc");
            }
        } else if (ac.equals("=")) {
            switch (ab) {
                case ">" -> System.out.println("bac");
                case "<" -> System.out.println("acb");
            }
        } else if (bc.equals("=")) {
            switch (ac) {
                case ">" -> System.out.println("cba");
                case "<" -> System.out.println("acb");
            }
        } else {
            if (ab.equals(">")) {
                if (bc.equals(">")) {
                    System.out.println("cba");
                } else if (bc.equals("<")) {
                    if (ac.equals(">")) {
                        System.out.println("bca");
                    } else if (ac.equals("<")) {
                        System.out.println("bac");
                    }
                }
            } else if (ab.equals("<")) {
                if (ac.equals(">")) {
                    System.out.println("cab");
                } else if (ac.equals("<")) {
                    if (bc.equals("<")) {
                        System.out.println("abc");
                    } else if (bc.equals(">")) {
                        System.out.println("abc");
                    }
                }
            }
        }
    }
}
