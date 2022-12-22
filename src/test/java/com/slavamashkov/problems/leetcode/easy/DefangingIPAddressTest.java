package com.slavamashkov.problems.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefangingIPAddressTest {
    @Test
    void defangIPaddr_IPAddress_ExpectedEqualsActual() {
        DefangingIPAddress testClass = new DefangingIPAddress();
        
        assertEquals(
                testClass.defangIPAddress("1.1.1.1"),
                "1[.]1[.]1[.]1"
        );

        assertEquals(
                testClass.defangIPAddress("255.100.50.0"),
                "255[.]100[.]50[.]0"
        );
    }
}