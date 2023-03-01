package com.slavamashkov.problems.yandex.training_2_0.lesson6;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeftAndRightBorderTest {
    @Test
    void getLeftAndRightBordersTest_1() {
        int[] arr = {1, 2, 2, 3};
        int[] queries = {4, 3, 2, 1};

        List<LeftAndRightBorder.Answer> expected = List.of(
                new LeftAndRightBorder.Answer(0, 0),
                new LeftAndRightBorder.Answer(4, 4),
                new LeftAndRightBorder.Answer(2, 3),
                new LeftAndRightBorder.Answer(1, 1)
        );

        List<LeftAndRightBorder.Answer> actual =
                LeftAndRightBorder.getLeftAndRightBorders(arr, queries);

        assertEquals(expected, actual);
    }

    @Test
    void getLeftAndRightBordersTest_2() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9};
        int[] queries = {7, 3, 3, 1, 3, 7, 9, 7, 7, 10};

        List<LeftAndRightBorder.Answer> expected = List.of(
                new LeftAndRightBorder.Answer(7, 8),
                new LeftAndRightBorder.Answer(3, 3),
                new LeftAndRightBorder.Answer(3, 3),
                new LeftAndRightBorder.Answer(1, 1),
                new LeftAndRightBorder.Answer(3, 3),
                new LeftAndRightBorder.Answer(7, 8),
                new LeftAndRightBorder.Answer(10, 10),
                new LeftAndRightBorder.Answer(7, 8),
                new LeftAndRightBorder.Answer(7, 8),
                new LeftAndRightBorder.Answer(0, 0)
        );

        List<LeftAndRightBorder.Answer> actual =
                LeftAndRightBorder.getLeftAndRightBorders(arr, queries);

        assertEquals(expected, actual);
    }

    @Test
    void getLeftAndRightBordersTest_3() {
        int[] arr = {1, 3, 3, 3, 3, 6, 8, 8, 9, 10};
        int[] queries = {2, 9, 6, 4, 2, 9, 3, 7, 9, 7};

        List<LeftAndRightBorder.Answer> expected = List.of(
                new LeftAndRightBorder.Answer(0, 0),
                new LeftAndRightBorder.Answer(9, 9),
                new LeftAndRightBorder.Answer(6, 6),
                new LeftAndRightBorder.Answer(0, 0),
                new LeftAndRightBorder.Answer(0, 0),
                new LeftAndRightBorder.Answer(9, 9),
                new LeftAndRightBorder.Answer(2, 5),
                new LeftAndRightBorder.Answer(0, 0),
                new LeftAndRightBorder.Answer(9, 9),
                new LeftAndRightBorder.Answer(0, 0)
        );

        List<LeftAndRightBorder.Answer> actual =
                LeftAndRightBorder.getLeftAndRightBorders(arr, queries);

        assertEquals(expected, actual);
    }
}