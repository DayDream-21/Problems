package com.slavamashkov.problems.yandex.training_2_0.lesson1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MetroTest {
    @Test
    void stationsTest_1() {
        int n = 100;
        int i = 5;
        int j = 6;

        int expected = 0;
        int actual = Metro.stations(n, i, j);

        assertEquals(expected, actual);
    }

    @Test
    void stationsTest_2() {
        int n = 10;
        int i = 1;
        int j = 9;

        int expected = 1;
        int actual = Metro.stations(n, i, j);

        assertEquals(expected, actual);
    }

    @Test
    void stationsTest_3() {
        int n = 15;
        int i = 9;
        int j = 2;

        int expected = 6;
        int actual = Metro.stations(n, i, j);

        assertEquals(expected, actual);
    }
}