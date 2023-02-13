package com.slavamashkov.problems.yandex.training_2_0.lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiplomaTest {
    @Test
    void calculateTimeTest_1() {
        int n = 3;
        int[] a = {3, 5, 2};
        int expected = 5;
        int actual = Diploma.calculateTime(n, a);

        assertEquals(expected, actual);
    }

    @Test
    void calculateTimeTest_2() {
        int n = 2;
        int[] a = {2, 1};
        int expected = 1;
        int actual = Diploma.calculateTime(n, a);

        assertEquals(expected, actual);
    }

    @Test
    void calculateTimeTest_3() {
        int n = 4;
        int[] a = {1, 7, 6, 3};
        int expected = 10;
        int actual = Diploma.calculateTime(n, a);

        assertEquals(expected, actual);
    }

    @Test
    void calculateTimeTest_4() {
        int n = 1;
        int[] a = {5};
        int expected = 0;
        int actual = Diploma.calculateTime(n, a);

        assertEquals(expected, actual);
    }

    @Test
    void calculateTimeTest_5() {
        int n = 0;
        int[] a = {};
        int expected = 0;
        int actual = Diploma.calculateTime(n, a);

        assertEquals(expected, actual);
    }
}