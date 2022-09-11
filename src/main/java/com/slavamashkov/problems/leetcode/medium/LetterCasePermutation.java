package com.slavamashkov.problems.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <h3>784. Letter Case Permutation</h3>
 *
 * <p>Given a string {@code s}, you can transform every letter individually to be lowercase or uppercase to create
 * another string.</p>
 *
 * <p>Return <i>a list of all possible strings we could create</i>. Return the output <b>in any order</b>.</p>
 */
public class LetterCasePermutation {
    public static void main(String[] args) {

    }

    public List<String> letterCasePermutationBFS(String S) {
        if (S == null) {
            return new LinkedList<>();
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(S);

        for (int i = 0; i < S.length(); i++) {
            if (Character.isDigit(S.charAt(i))) {
                continue;
            }

            int size = queue.size();

            for (int j = 0; j < size; j++) {
                String cur = queue.poll();
                char[] chs = cur.toCharArray();

                chs[i] = Character.toUpperCase(chs[i]);
                queue.offer(String.valueOf(chs));

                chs[i] = Character.toLowerCase(chs[i]);
                queue.offer(String.valueOf(chs));
            }
        }

        return new LinkedList<>(queue);
    }

    private static List<String> letterCasePermutation(String s) {
        List<String> resultList = new ArrayList<>();

        dfs(s.toCharArray(), resultList, 0);

        return resultList;
    }

    private static void dfs(char[] chars, List<String> resultList, int pos) {
        if (pos == chars.length) {
            resultList.add(new String(chars));
            return;
        }

        if (chars[pos] >= '0' && chars[pos] <= '9') {
            dfs(chars, resultList, pos + 1);
            return;
        }

        chars[pos] = Character.toLowerCase(chars[pos]);
        dfs(chars, resultList, pos + 1);

        chars[pos] = Character.toUpperCase(chars[pos]);
        dfs(chars, resultList, pos + 1);
    }
}
