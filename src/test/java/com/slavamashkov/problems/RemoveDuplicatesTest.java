package com.slavamashkov.problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RemoveDuplicatesTest {
    @Test
    public void removeDuplicatesTest() {
        int[][] tests = {
                {1, 1, 2},
                {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}
        };


        int[] results = {2, 5};

        for (int i = 0; i < tests.length; i++) {
            Assert.assertEquals(new RemoveDuplicates().removeDuplicates(tests[i]), results[i]);
            System.out.println(Arrays.toString(tests[i]));
        }
    }
}