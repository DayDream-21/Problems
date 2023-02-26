package com.slavamashkov.problems.yandex.training_2_0.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesisTest {
    @Test
    void validateTest_1() {
        String line = "(())()";

        boolean expected = true;
        boolean actual = Parenthesis.validate(line);

        assertEquals(expected, actual);
    }

    @Test
    void validateTest_2() {
        String line = "(()))()";

        boolean expected = false;
        boolean actual = Parenthesis.validate(line);

        assertEquals(expected, actual);
    }

    @Test
    void validateTest_3() {
        String line = "(";

        boolean expected = false;
        boolean actual = Parenthesis.validate(line);

        assertEquals(expected, actual);
    }

    @Test
    void validateTest_4() {
        String line = "(()()())()(())))";

        boolean expected = false;
        boolean actual = Parenthesis.validate(line);

        assertEquals(expected, actual);
    }

    @Test
    void validateTest_5() {
        String line = "(((()))())";

        boolean expected = true;
        boolean actual = Parenthesis.validate(line);

        assertEquals(expected, actual);
    }


    @Test
    void validateTest_6() {
        String line = "(((()))(()()()()()";

        boolean expected = false;
        boolean actual = Parenthesis.validate(line);

        assertEquals(expected, actual);
    }
}