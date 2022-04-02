package com.slavamashkov.problems.leetcode.medium;

/**
 * <h3>12. Integer to Roman</h3>
 *
 * <p>Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.</p>
 *
 * <table>
 *   <tr>
 *     <td><b>Symbol</b></td><td><b>Value</b></td>
 *   </tr>
 *   <tr>
 *     <td> I </td> <td> 1 </td>
 *   </tr>
 *   <tr>
 *     <td> V </td> <td> 5 </td>
 *   </tr>
 *   <tr>
 *     <td> X </td> <td> 10 </td>
 *   </tr>
 *   <tr>
 *     <td> L </td> <td> 50 </td>
 *   </tr>
 *   <tr>
 *     <td> C </td> <td> 100 </td>
 *   </tr>
 *   <tr>
 *     <td> D </td> <td> 500 </td>
 *   </tr>
 *   <tr>
 *     <td> M </td> <td> 1000 </td>
 *   </tr>
 * </table>
 *
 * <p>For example, {@code 2} is written as {@code II} in Roman numeral, just two one's added together. {@code 12} is
 * written as {@code XII}, which is simply {@code X + II}. The number {@code 27} is written as {@code XXVII}, which
 * is {@code XX + V + II}.</p>
 *
 * <p>Roman numerals are usually written largest to smallest from left to right. However, the numeral for four
 * is not {@code IIII}. Instead, the number four is written as {@code IV}. Because the one is before the five we
 * subtract it making four. The same principle applies to the number nine, which is written as {@code IX}. There
 * are six instances where subtraction is used:</p>
 *
 * <ul>
 *     <li>{@code I} can be placed before {@code V} (5) and {@code X} (10) to make 4 and 9.</li>
 *     <li>{@code X} can be placed before {@code L} (50) and {@code C} (100) to make 40 and 90. </li>
 *     <li>{@code C} can be placed before {@code D} (500) and {@code M} (1000) to make 400 and 900.</li>
 * </ul>
 *
 * <p>Given an integer, convert it to a roman numeral.</p>
 */

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
