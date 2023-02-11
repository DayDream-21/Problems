package com.slavamashkov.problems.yandex.training_2_0.lesson1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    @Test
    void computeTest_1() {
        int n = 4;
        List<Integer> coord = List.of(1, 2, 3, 4);

        int expected = 3;
        int actual = School.compute(n, coord);

        assertEquals(expected, actual);
    }

    @Test
    void computeTest_2() {
        int n = 3;
        List<Integer> coord = List.of(-1, 0, 1);

        int expected = 0;
        int actual = School.compute(n, coord);

        assertEquals(expected, actual);
    }
}