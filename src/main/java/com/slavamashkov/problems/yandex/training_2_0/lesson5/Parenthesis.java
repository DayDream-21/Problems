package com.slavamashkov.problems.yandex.training_2_0.lesson5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Parenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        if (validate(line)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean validate(String line) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
