package com.slavamashkov.problems.leetcode.easy;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <h3>20. Valid Parentheses</h3>
 *
 * <p>Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine
 * if the input string is valid.</p>
 *
 * <p>An input string is valid if:</p>
 * <ul>
 *     <li>
 *         Open brackets must be closed by the same type of brackets.
 *     </li>
 *     <li>
 *         Open brackets must be closed in the correct order.
 *     </li>
 * </ul>
 */

public class ValidParentheses {
    public boolean isValid(String s) {
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
