package com.slavamashkov.problems.leetcode.easy;

/**
 * <h3>1108. Defanging an IP Address</h3>
 *
 * <p>Given a valid (IPv4) IP {@code address}, return a defanged version of that IP address.</p>
 *
 * <p>A <i>defanged IP address</i> replaces every period {@code "."} with {@code "[.]"}.</p>
 */

public class DefangingIPAddress {
    public String defangIPAddress(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
