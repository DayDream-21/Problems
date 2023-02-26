package com.slavamashkov.problems.yandex.training_2_0.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumTest {
    @Test
    void findMaxSumTest_1() {
        int[] arr = {1, 2, 3, 4};

        int expected = 10;
        int actual = MaxSum.findMaxSum(arr);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxSumTest_2() {
        int[] arr = {5, 4, -10, 4};

        int expected = 9;
        int actual = MaxSum.findMaxSum(arr);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxSumTest_3() {
        int[] arr = {1, -2, 3, 10, -4, 7, 2, -5};

        int expected = 18;
        int actual = MaxSum.findMaxSum(arr);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxSumTest_4() {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        int expected = 7;
        int actual = MaxSum.findMaxSum(arr);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxSumTest_5() {
        int[] arr = {-1, -2, -3, -4, -5};

        int expected = -1;
        int actual = MaxSum.findMaxSum(arr);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxSumTest_6() {
        int[] arr = {0, 0, 0, 0, 0};

        int expected = 0;
        int actual = MaxSum.findMaxSum(arr);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxSumTest_7() {
        int[] arr = {-1, -2, 5, -4, -5};

        int expected = 5;
        int actual = MaxSum.findMaxSum(arr);

        assertEquals(expected, actual);
    }
}