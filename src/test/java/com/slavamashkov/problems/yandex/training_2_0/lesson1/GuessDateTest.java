package com.slavamashkov.problems.yandex.training_2_0.lesson1;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class GuessDateTest {

    @Test
    void isCorrectDateTest_1() {
        int x = 1;
        int y = 2;
        int z = 2003;

        int expected = 0;
        int actual = GuessDate.isCorrectDate(x, y, z);

        assertEquals(expected, actual);
    }

    @Test
    void isCorrectDateTest_2() {
        int x = 2;
        int y = 29;
        int z = 2008;

        int expected = 1;
        int actual = GuessDate.isCorrectDate(x, y, z);

        assertEquals(expected, actual);
    }

    Random random = new Random();

    @Test
    void isCorrectDateTest_3() {
        int z = 2000;

        for (int i = 0; i < 1000; i++) {
            int x = random.nextInt(31);
            int y = random.nextInt(31);

            int expected = GuessDate.isCorrectDate(x, y, z);
            int actual = GuessDate.isCorrectDateMine(x, y, z);
            System.out.print(x + " " + y + " " + z + " his: " + expected + " mine: " + actual);
            System.out.println();
        }
    }
}