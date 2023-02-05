package com.slavamashkov.problems.other;

import java.util.HashMap;
import java.util.Map;

public class DigitToNumber {
    public static void main(String[] args) {
        System.out.println(digitToWord(123));
        System.out.println(digitToWord(0));
        System.out.println(digitToWord(202));
    }

    public static String digitToWord(int number) {
        Map<Integer, String> digitNumberMap = new HashMap<>();
        digitNumberMap.put(0, "Zero");
        digitNumberMap.put(1, "One");
        digitNumberMap.put(2, "Two");
        digitNumberMap.put(3, "Three");
        digitNumberMap.put(4, "Four");
        digitNumberMap.put(5, "Five");
        digitNumberMap.put(6, "Six");
        digitNumberMap.put(7, "Seven");
        digitNumberMap.put(8, "Eight");
        digitNumberMap.put(9, "Nine");

        if (number == 0) {
            return(digitNumberMap.get(number));
        }

        String result = "";
        StringBuilder sb = new StringBuilder(result);

        while (number > 0) {
            int temp = number % 10;
            sb.insert(0, digitNumberMap.get(temp) + " ");
            number /= 10;
        }

        return sb.toString();
    }
}
