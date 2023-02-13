package com.slavamashkov.problems.yandex.training_2_0.lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    void createPalindromeTest_1() {
        String str = "a";
        int expected = 0;

        int actual = Palindrome.createPalindrome(str);

        assertEquals(expected, actual);
    }

    @Test
    void createPalindromeTest_2() {
        String str = "ab";
        int expected = 1;

        int actual = Palindrome.createPalindrome(str);

        assertEquals(expected, actual);
    }

    @Test
    void createPalindromeTest_3() {
        String str = "cognitive";
        int expected = 4;

        int actual = Palindrome.createPalindrome(str);

        assertEquals(expected, actual);
    }

    @Test
    void createPalindromeTest_4() {
        String str = "abcddcaa";
        int expected = 1;

        int actual = Palindrome.createPalindrome(str);

        assertEquals(expected, actual);
    }

    @Test
    void createPalindromeTest_5() {
        String str = "xyzdabc";
        int expected = 3;

        int actual = Palindrome.createPalindrome(str);

        assertEquals(expected, actual);
    }
}