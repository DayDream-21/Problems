package com.slavamashkov.problems.yandex.training_2_0.lesson6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForestTest {
    @Test
    void getDaysTest_1() {
        int a = 1;
        int k = 2;
        int b = 1;
        int m = 3;
        int x = 10;

        int expected = 8;
        int actual = Forest.getDays(a, k, b, m, x);

        assertEquals(expected, actual);
    }

    @Test
    void getDaysTest_2() {
        int a = 1;
        int k = 2;
        int b = 1;
        int m = 3;
        int x = 11;

        int expected = 9;
        int actual = Forest.getDays(a, k, b, m, x);

        assertEquals(expected, actual);
    }

    @Test
    void getDaysTest_3() {
        int a = 19;
        int k = 3;
        int b = 14;
        int m = 6;
        int x = 113;

        int expected = 4;
        int actual = Forest.getDays(a, k, b, m, x);

        assertEquals(expected, actual);
    }

    @Test
    void getDaysTest_4() {
        int a = 2;
        int k = 4;
        int b = 3;
        int m = 3;
        int x = 25;

        int expected = 7;
        int actual = Forest.getDays(a, k, b, m, x);

        assertEquals(expected, actual);
    }
}