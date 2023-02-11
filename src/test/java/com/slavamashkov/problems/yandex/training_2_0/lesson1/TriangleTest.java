package com.slavamashkov.problems.yandex.training_2_0.lesson1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void findLocationTest_1() {
        int d = 5;
        int x = 1;
        int y = 1;

        int expected = 0;
        int actual = Triangle.findLocation(d, x, y);

        assertEquals(expected, actual);
    }

    @Test
    void findLocationTest_2() {
        int d = 3;
        int x = -1;
        int y = -1;

        int expected = 1;
        int actual = Triangle.findLocation(d, x, y);

        assertEquals(expected, actual);
    }

    @Test
    void findLocationTest_3() {
        int d = 4;
        int x = 4;
        int y = 4;

        int expected = 2;
        int actual = Triangle.findLocation(d, x, y);

        assertEquals(expected, actual);
    }

    @Test
    void findLocationTest_4() {
        int d = 4;
        int x = 2;
        int y = 2;

        int expected = 0;
        int actual = Triangle.findLocation(d, x, y);

        assertEquals(expected, actual);
    }
}