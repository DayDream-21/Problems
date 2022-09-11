package com.slavamashkov.problems.yandex_10_09_2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProblemA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(inspect(str1, str2));
    }

    public static String inspect(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map1 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            if (map1.containsKey(str1.charAt(i))) {
                map1.put(str1.charAt(i), map1.get(str1.charAt(i)) + 1);
            } else {
                map1.put(str1.charAt(i), 1);
            }
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                sb.append('P');
                map1.put(str1.charAt(i), map1.get(str1.charAt(i)) - 1);
            } else {
                if (map1.containsKey(str2.charAt(i))) {
                    if (map1.get(str2.charAt(i)) < 1) {
                        sb.append('I');
                    } else {
                        sb.append('S');
                        map1.put(str2.charAt(i), map1.get(str2.charAt(i)) - 1);
                    }

                    map1.put(str2.charAt(i), map1.get(str2.charAt(i)) - 1);
                } else {
                    sb.append('I');
                }
            }
        }

        return sb.toString();
    }
}


    /*StringBuilder result = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
        boolean isFound = false;

        if (str1.charAt(i) == str2.charAt(i)) {
        result.append('P');
        isFound = true;
        } else {
        for (int j = 0; j < str2.length(); j++) {
        if (str1.charAt(j) == str2.charAt(i) && j != i) {
        result.append('S');
        isFound = true;
        break;
        }
        }
        }

        if (!isFound) {
        result.append('I');
        }
        }

        return result.toString();*/
