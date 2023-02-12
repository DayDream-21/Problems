package com.slavamashkov.problems.tinkoff.contest_12_02_2023;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Пример 1
 * 1234??7890
 * YES
 * <p>
 * Пример 2
 * 11223344550?2?4?6?80?6677889900
 * YES
 * <p>
 * Пример 3
 * 0?2?4?6?802?
 * NO
 */
public class Cypher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();

        System.out.println(isDimasCypher(message));
    }

    private static String isDimasCypher(String message) {
        Set<Integer> nums = new HashSet<>();
        int countQuestions = 0;

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == '?') {
                countQuestions++;
            } else {
                if (!nums.contains(charToInt(message.charAt(i)))) {
                    nums.add(charToInt(message.charAt(i)));
                } else {
                    nums.clear();
                    nums.add(charToInt(message.charAt(i)));
                }
            }

            if (nums.size() + countQuestions == 10) {
                return "YES";
            }
        }

        return "NO";
    }

    private static Integer charToInt(char ch) {
        return Integer.parseInt(String.valueOf(ch));
    }
}
