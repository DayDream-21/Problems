package com.slavamashkov.problems.yandex.training_2_0.lesson1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InteractorTest {
    @Test
    void totalVerdictTest_1() {
        int r = 0;
        int i = 0;
        int c = 0;

        int expected = 0;
        int actual = Interactor.totalVerdict(r, i, c);

        assertEquals(expected, actual);
    }

    @Test
    void totalVerdictTest_2() {
        int r = -1;
        int i = 0;
        int c = 1;

        int expected = 3;
        int actual = Interactor.totalVerdict(r, i, c);

        assertEquals(expected, actual);
    }

    @Test
    void totalVerdictTest_3() {
        int r = 42;
        int i = 1;
        int c = 6;

        int expected = 6;
        int actual = Interactor.totalVerdict(r, i, c);

        assertEquals(expected, actual);
    }

    @Test
    void totalVerdictTest_4() {
        int r = 44;
        int i = 7;
        int c = 4;

        int expected = 1;
        int actual = Interactor.totalVerdict(r, i, c);

        assertEquals(expected, actual);
    }

    @Test
    void totalVerdictTest_5() {
        int r = 1;
        int i = 4;
        int c = 0;

        int expected = 3;
        int actual = Interactor.totalVerdict(r, i, c);

        assertEquals(expected, actual);
    }

    @Test
    void totalVerdictTest_6() {
        int r = -3;
        int i = 2;
        int c = 4;

        int expected = 2;
        int actual = Interactor.totalVerdict(r, i, c);

        assertEquals(expected, actual);
    }
}