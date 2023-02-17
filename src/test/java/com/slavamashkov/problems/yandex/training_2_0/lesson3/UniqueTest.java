package com.slavamashkov.problems.yandex.training_2_0.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueTest {

    @Test
    void findUniqueTest_1() {
        int[] arr = {1, 2, 2, 3, 3, 3};

        int[] expected = {1};
        int[] actual = Unique.findUnique(arr);

        assertArrayEquals(expected, actual);
    }

    @Test
    void findUniqueTest_2() {
        int[] arr = {4, 3, 5, 2, 5, 1, 3, 5};

        int[] expected = {4, 2, 1};
        int[] actual = Unique.findUnique(arr);

        assertArrayEquals(expected, actual);
    }

    @Test
    void findUniqueTest_3() {
        int[] arr = {1, 2, 1, 2, 3, 3};

        int[] expected = {};
        int[] actual = Unique.findUnique(arr);

        assertArrayEquals(expected, actual);
    }

    @Test
    void findUniqueTest_4() {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] actual = Unique.findUnique(arr);

        assertArrayEquals(expected, actual);
    }
}