package com.slavamashkov.problems.leetcode.easy;

/*
* There is a programming language with only four operations
* and one variable X:
* ++X and X++ increments the value of the variable X by 1.
* --X and X-- decrements the value of the variable X by 1.
* Initially, the value of X is 0.

* Given an array of strings operations containing a list of
* operations, return the final value of X after performing all
* the operations.
* */

import java.util.HashMap;
import java.util.Map;

public class ValueAfterOperations {
    public static void main(String[] args) {
        String[] operations = {"X++", "X--", "X++", "X++"};

        System.out.println(finalValueAfterOperationsMap(operations));
    }

    private static int finalValueAfterOperationsMap(String[] operations) {
        Map<String, Operation> operationMap = new HashMap<>();
        operationMap.put("++X", num -> num+1);
        operationMap.put("X++", num -> num+1);
        operationMap.put("--X", num -> num-1);
        operationMap.put("X--", num -> num-1);

        int result = 0;

        for (String s : operations) {
            result = operationMap.get(s).perform(result);
        }

        return result;
    }

    private static int finalValueAfterOperationsLoop(String[] operations) {
        int result = 0;

        for (String s : operations) {
            if (s.equals("X++") || s.equals("++X")) {
                result++;
            } else {
                result--;
            }
        }

        return result;
    }

    @FunctionalInterface
    interface Operation {
        int perform(int num);
    }
}
