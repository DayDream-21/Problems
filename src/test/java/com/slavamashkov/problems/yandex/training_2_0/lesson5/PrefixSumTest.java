package com.slavamashkov.problems.yandex.training_2_0.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrefixSumTest {

    @Test
    void createPrefixSumArrTest_1() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {0, 1, 3, 6, 10, 15};
        assertArrayEquals(expected, PrefixSum.getPrefixSum(arr));
    }

    @Test
    void createPrefixSumArrTest_2() {
        int[] arr2 = {0, 0, 0, 0, 0};
        int[] expected2 = {0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected2, PrefixSum.getPrefixSum(arr2));
    }

    @Test
    void sumInRangeTest_1() {
        int[] arr = {1, 2, 3, 4};

        assertEquals(1, PrefixSum.sumInRange(PrefixSum.getPrefixSum(arr), 1, 1));
    }

    @Test
    void sumInRangeTest_2() {
        int[] arr = {1, 2, 3, 4};

        assertEquals(3, PrefixSum.sumInRange(PrefixSum.getPrefixSum(arr), 1, 2));
    }

    @Test
    void sumInRangeTest_3() {
        int[] arr = {1, 2, 3, 4};

        assertEquals(6, PrefixSum.sumInRange(PrefixSum.getPrefixSum(arr), 1, 3));
    }

    @Test
    void sumInRangeTest_4() {
        int[] arr = {1, 2, 3, 4};

        assertEquals(10, PrefixSum.sumInRange(PrefixSum.getPrefixSum(arr), 1, 4));
    }
}