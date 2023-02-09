package com.slavamashkov.problems.leetcode.easy;

import org.junit.jupiter.api.Test;

import static com.slavamashkov.problems.leetcode.easy.LastWordLength.lengthOfLastWord;
import static org.junit.jupiter.api.Assertions.*;

class LastWordLengthTest {
    @Test
    public void testLengthOfLastWord() {
        String input = "Hello World";
        int expected = 5;

        int result = lengthOfLastWord(input);

        assertEquals(expected, result);
    }

    @Test
    public void testLengthOfLastWord_MultipleSpaces() {
        String input = "   fly me   to   the moon  ";
        int expected = 4;

        int result = lengthOfLastWord(input);

        assertEquals(expected, result);
    }

    @Test
    public void testLengthOfLastWord_EmptyString() {
        String input = "";
        int expected = 0;

        int result = lengthOfLastWord(input);

        assertEquals(expected, result);
    }
}