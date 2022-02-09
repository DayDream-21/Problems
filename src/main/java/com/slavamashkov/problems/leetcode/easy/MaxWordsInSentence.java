package com.slavamashkov.problems.leetcode.easy;

/*
* A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
* You are given an array of strings sentences, where each sentences[i] represents a single sentence.
* Return the maximum number of words that appear in a single sentence.
* */

public class MaxWordsInSentence {
    public static void main(String[] args) {
        String[] sentences = {
                "alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"
        };

        System.out.println(mostWordsFound(sentences));
    }

    private static int mostWordsFound(String[] sentences) {
        int result = 0;

        for (String s : sentences) {
            result = Math.max(result, s.split(" ").length);
        }

        return result;
    }
}
