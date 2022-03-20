package com.slavamashkov.problems.leetcode.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * You are given a <b>positive</b> integer {@code num} consisting of exactly
 * four <b>digits</b>. Split {@code num} into two new integers {@code new1}
 * and {@code new2} by using the digits found in {@code num}. <b>Leading zeros</b>
 * are allowed in {@code new1} and {@code new2}, and <b>all</b> the digits
 * found in {@code num} must be used.
 * <ul>
 *     <li>
 *         For example, given {@code num = 2932}, you have the following digits:
 *         two {@code 2}'s, one {@code 9} and one {@code 3}. Some of the possible
 *         pairs {@code [new1, new2]} are {@code [22, 93]}, {@code [23, 92]},
 *         {@code [223, 9]} and {@code [2, 329]}.
 *     </li>
 * </ul>
 *
 * Return <i>the <b>minimum</b> possible sum of</i> {@code new1} <i>and</i> {@code new2}.
 * */

public class MinimumSumFourDigit {
    public static void main(String[] args) {
        try {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));

            int num = Integer.parseInt(br.readLine());

            System.out.println(minSum(num));
        } catch (Exception e) {
            System.err.println("Error:" + e.getMessage());
        }
    }

    protected static int minSum(int num) {
        int new1 = 0;
        int new2 = 0;
        List<Integer> list = new ArrayList<>();

        if (num < 1000 || num > 9999) {
            return 0;
        }

        while (num != 0) {
            int d = num % 10;
            if (d != 0) {
                list.add(d);
            }
            num /= 10;
        }

        list.sort(Comparator.naturalOrder());

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                new1 = new1 * 10 + list.get(i);
            } else {
                new2 = new2 * 10 + list.get(i);
            }
        }

        return new1 + new2;
    }
}
