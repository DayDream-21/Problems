package com.slavamashkov.problems;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static void main(String[] args) {
        String input = "([}])";
        System.out.println(isValid(input));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.addLast(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peekLast() == '(') {
                stack.removeLast();
            } else if (c == '}' && !stack.isEmpty() && stack.peekLast() == '{') {
                stack.removeLast();
            } else if (c == ']' && !stack.isEmpty() && stack.peekLast() == '[') {
                stack.removeLast();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
