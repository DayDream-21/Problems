package com.slavamashkov.problems.yandex.training_2_0.lesson2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberTest {
    @Test
    public void countMaxTest_1() {
        List<Integer> nums = List.of(1, 7, 9);

        int expected = 1;
        int actual = MaxNumber.countMax(nums);

        assertEquals(expected, actual);
    }

    @Test
    public void countMaxTest_2() {
        List<Integer> nums = List.of(1, 3, 3, 1);

        int expected = 2;
        int actual = MaxNumber.countMax(nums);

        assertEquals(expected, actual);
    }

    @Test
    public void countMaxTest_3() {
        List<Integer> nums = List.of(3, 1, 1, 5);

        int expected = 1;
        int actual = MaxNumber.countMax(nums);

        assertEquals(expected, actual);
    }

    @Test
    public void countMaxTest_4() {
        List<Integer> nums = List.of();

        int expected = 0;
        int actual = MaxNumber.countMax(nums);

        assertEquals(expected, actual);
    }

    @Test
    public void countMaxTest_5() {
        List<Integer> nums = List.of(7);

        int expected = 1;
        int actual = MaxNumber.countMax(nums);

        assertEquals(expected, actual);
    }
}