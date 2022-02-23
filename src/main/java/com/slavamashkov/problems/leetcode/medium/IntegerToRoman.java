package com.slavamashkov.problems.leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(new IntegerToRoman().intToRoman(2944));
    }



    private String intToRoman(int num) {
        class Numeral {
            public final String symbol;
            public final Integer value;

            public Numeral(String symbol, Integer value) {
                this.symbol = symbol;
                this.value = value;
            }
        }
        // Create arabian-roman dictionary
        Numeral[] numerals = {
                new Numeral("M", 1000),
                new Numeral("CM", 900),
                new Numeral("D", 500),
                new Numeral("CD", 400),
                new Numeral("C", 100),
                new Numeral("XC", 90),
                new Numeral("L", 50),
                new Numeral("XL", 40),
                new Numeral("X", 10),
                new Numeral("IX", 9),
                new Numeral("V", 5),
                new Numeral("IV", 4),
                new Numeral("I", 1)
        };

        StringBuilder result = new StringBuilder();

        for (Numeral numeral : numerals) {
            int numberOfSymbols = num / numeral.value;

            if (numberOfSymbols != 0) {
                result.append(numeral.symbol.repeat(numberOfSymbols));
            }

            num %= numeral.value;
        }

        return result.toString();
    }
}
