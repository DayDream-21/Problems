package com.slavamashkov.problems;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {
    @Test
    public void IsValid_RightParenthesesCombination_True() {
        String input1 = "()";
        String input2 = "(){}[]";

        Assert.assertTrue(new ValidParentheses().isValid(input1));
        Assert.assertTrue(new ValidParentheses().isValid(input2));
    }

    @Test
    public void IsValid_WrongParenthesesCombination_False() {
        String input1 = "(]";
        String input2 = "([)]";

        Assert.assertFalse(new ValidParentheses().isValid(input1));
        Assert.assertFalse(new ValidParentheses().isValid(input2));
    }
}