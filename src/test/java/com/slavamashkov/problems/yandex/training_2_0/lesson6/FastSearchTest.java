package com.slavamashkov.problems.yandex.training_2_0.lesson6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FastSearchTest {
    @Test
    void numbersInRangesTest_1() {
        int[] arr = {10, 1, 10, 3, 4}; // 1 3 4 10 10
        List<FastSearch.Query> queries = List.of(
                new FastSearch.Query(1, 10),
                new FastSearch.Query(2, 9),
                new FastSearch.Query(3, 4),
                new FastSearch.Query(2, 2),
                new FastSearch.Query(6, 7)
        );

        int[] expected = {5, 2, 2, 0, 0};
        int[] actual = FastSearch.numbersInRanges(arr, queries);

        assertArrayEquals(expected, actual);
    }

    @Test
    void numbersInRangesTest_2() {
        int[] arr = {-5, 0, -3, 2, 7, 7, 1, 9}; // -5 -3 0 1 2 7 7 9
        List<FastSearch.Query> queries = List.of(
                new FastSearch.Query(-10, 10),
                new FastSearch.Query(1, 1),
                new FastSearch.Query(3, 3),
                new FastSearch.Query(8, 10),
                new FastSearch.Query(-4, 3)
        );

        int[] expected = {8, 1, 0, 1, 4};
        int[] actual = FastSearch.numbersInRanges(arr, queries);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLeftIndexTest_1() {
        int[] arr = new int[] {2, 3, 3, 5, 5, 5, 6, 6};
        int target = 2;

        int expected = 0;
        int actual = FastSearch.getLeftIndex(arr, target);

        assertEquals(expected, actual);
    }

    @Test
    void getLeftIndexTest_2() {
        int[] arr = new int[] {2, 3, 3, 5, 5, 5, 6, 6};
        int target = 5;

        int expected = 3;
        int actual = FastSearch.getLeftIndex(arr, target);

        assertEquals(expected, actual);
    }

    @Test
    void getLeftIndexTest_3() {
        int[] arr = {1, 3, 4, 10, 10};
        int target = 1;

        int expected = 0;
        int actual = FastSearch.getLeftIndex(arr, target);

        assertEquals(expected, actual);
    }

    @Test
    void getLeftIndexTest_4() {
        int[] arr = {1, 3, 4, 10, 10};
        int target = 2;

        int expected = 1;
        int actual = FastSearch.getLeftIndex(arr, target);

        assertEquals(expected, actual);
    }

    @Test
    void getLeftIndexTest_5() {
        int[] arr = {1, 3, 4, 10, 10};
        int target = 3;

        int expected = 1;
        int actual = FastSearch.getLeftIndex(arr, target);

        assertEquals(expected, actual);
    }

    @Test
    void getRightIndexTest_1() {
        int[] arr = new int[] {2, 3, 3, 5, 5, 5, 6, 6};
        int target = 2;

        int expected = 0;
        int actual = FastSearch.getRightIndex(arr, target);

        assertEquals(expected, actual);
    }

    @Test
    void getRightIndexTest_2() {
        int[] arr = new int[] {2, 3, 3, 5, 5, 5, 6, 6};
        int target = 5;

        int expected = 5;
        int actual = FastSearch.getRightIndex(arr, target);

        assertEquals(expected, actual);
    }

    @Test
    void getRightIndexTest_3() {
        int[] arr = {1, 3, 4, 10, 10};
        int target = 11;

        int expected = 4;
        int actual = FastSearch.getRightIndex(arr, target);

        assertEquals(expected, actual);
    }

    @Test
    void getRightIndexTest_4() {
        int[] arr = {1, 3, 4, 10, 10};
        int target = 9;

        int expected = 2;
        int actual = FastSearch.getRightIndex(arr, target);

        assertEquals(expected, actual);
    }

    @Test
    void getRightIndexTest_5() {
        int[] arr = {1, 3, 4, 10, 10};
        int target = 4;

        int expected = 2;
        int actual = FastSearch.getRightIndex(arr, target);

        assertEquals(expected, actual);
    }

    @Test
    void getRightIndexTest_6() {
        int[] arr = {1, 3, 4, 10, 10};
        int target = 2;

        int expected = 0;
        int actual = FastSearch.getRightIndex(arr, target);

        assertEquals(expected, actual);
    }
}