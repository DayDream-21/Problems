package com.slavamashkov.problems.leetcode.medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * <h3>1689. Partitioning Into Minimum Number Of Deci-Binary Numbers</h3>
 *
 * <p>A decimal number is called <b>deci-binary</b> if each of its digits is either {@code 0} or {@code 1} without
 * any leading zeros. For example, {@code 101} and {@code 1100} are <b>deci-binary</b>, while {@code 112} and
 * {@code 3001} are not.</p>
 *
 * <p>Given a string {@code n} that represents a positive decimal integer, return <i>the <b>minimum</b> number
 * of positive <b>deci-binary</b> numbers needed so that they sum up to</i> {@code n}.</p>
 * */

public class PartitioningIntoMinimumNumber {
    public static void main(String[] args) {
        try {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));

            String n = br.readLine();

            System.out.println(binaryAmount(n));
        } catch (Exception e) {
            System.err.println("Error:" + e.getMessage());
        }
    }

    protected static int binaryAmount(String n) {
        char maxChar = '0';
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) > maxChar) {
                maxChar = n.charAt(i);
            }
        }

        return Integer.parseInt(String.valueOf(maxChar));
    }
}
