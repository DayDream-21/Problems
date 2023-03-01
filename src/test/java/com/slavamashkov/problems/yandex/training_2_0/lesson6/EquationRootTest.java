package com.slavamashkov.problems.yandex.training_2_0.lesson6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquationRootTest {
    @Test
    void searchRootTest_1() {
        int a = 1;
        int b = -3;
        int c = 3;
        int d = -1;

        double expected = 1.0000036491;
        double actual = EquationRoot.searchRoot(a, b, c, d);
        System.out.println(actual);
        assertEquals(expected, actual, 1e-5);
    }

    @Test
    void searchRootTest_2() {
        int a = -1;
        int b = -6;
        int c = -12;
        int d = -7;

        double expected = -1.0000000111;
        double actual = EquationRoot.searchRoot(a, b, c, d);
        System.out.println(actual);
        assertEquals(expected, actual, 1e-5);
    }

    @Test
    void searchRootTest_5() {
        int a = 8;
        int b = -36;
        int c = 54;
        int d = -27;

        double expected = 1.5;
        double actual = EquationRoot.searchRoot(a, b, c, d);
        System.out.println(actual);
        assertEquals(expected, actual, 1e-5);
    }

    @Test
    void searchRootTest_6() {
        int a = 8;
        int b = 12;
        int c = 6;
        int d = 1;

        double expected = -0.5;
        double actual = EquationRoot.searchRoot(a, b, c, d);
        System.out.println(actual);
        assertEquals(expected, actual, 1e-5);
    }
}