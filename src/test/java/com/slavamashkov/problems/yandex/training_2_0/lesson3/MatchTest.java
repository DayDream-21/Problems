package com.slavamashkov.problems.yandex.training_2_0.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchTest {

    @Test
    void findMatchingNumbersTest_1() {
        int[] arr1 = {1, 3, 2};
        int[] arr2 = {4, 3, 2};

        int expected = 2;
        int actual = Match.findMatchingNumbers(arr1, arr2);

        assertEquals(expected, actual);
    }

    @Test
    void findMatchingNumbersTest_2() {
        int[] arr1 = {1, 2, 6, 4, 5, 7};
        int[] arr2 = {10, 2, 3, 4, 8,};

        int expected = 2;
        int actual = Match.findMatchingNumbers(arr1, arr2);

        assertEquals(expected, actual);
    }

    @Test
    void findMatchingNumbersTest_3() {
        int[] arr1 = {1, 7, 3, 8, 10, 2, 5};
        int[] arr2 = {6, 5, 2, 8, 4, 3, 7};

        int expected = 5;
        int actual = Match.findMatchingNumbers(arr1, arr2);

        assertEquals(expected, actual);
    }
}