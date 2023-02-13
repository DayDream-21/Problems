package com.slavamashkov.problems.yandex.training_2_0.lesson2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    @Test
    void maxLengthTest_1() {
        List<Integer> list = List.of(2, 0, 1, 1, 0, 1, 0, 2, 1, 2);

        int expected = 3;
        int actual = Shop.maxLengthSlow(list);

        assertEquals(expected, actual);
    }

    @Test
    void maxLengthTest_2() {
        List<Integer> list = List.of(0, 1, 0, 0, 0, 0, 0, 0, 0, 2);

        int expected = 8;
        int actual = Shop.maxLengthSlow(list);

        assertEquals(expected, actual);
    }

    @Test
    void maxLengthTest_3() {
        List<Integer> list = List.of(2, 0, 0, 0, 0, 0, 0, 0, 1, 0);

        int expected = 8;
        int actual = Shop.maxLengthSlow(list);

        assertEquals(expected, actual);
    }
}