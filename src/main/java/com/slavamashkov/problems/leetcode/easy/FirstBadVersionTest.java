package com.slavamashkov.problems.leetcode.easy;

import java.util.Arrays;

/**
 * <p>You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check. Since
 * each version is developed based on the previous version, all the versions after a bad
 * version are also bad.</p>
 *
 * <p>Suppose you have n versions {@code [1, 2, ..., n]} and you want to find out the first
 * bad one, which causes all the following ones to be bad.</p>
 *
 * <p>You are given an API {@code bool isBadVersion(version)} which returns whether
 * {@code version} is bad. Implement a function to find the first bad version. You
 * should minimize the number of calls to the API.</p>
 */

public class FirstBadVersionTest {
    public static void main(String[] args) {
        FirstBadVersion fbv = new FirstBadVersion(5, 4);
        System.out.println(fbv);
        System.out.println(fbv.firstBadVersion(fbv.getLength()));
    }
}

class FirstBadVersion {
    private final boolean[] versions;
    private final int length;

    public FirstBadVersion(int length, int corruptVersion) {
        this.versions = new boolean[length];
        this.length = length;

        for (int i = 0; i < length; i++) {
            if (i >= corruptVersion - 1) {
                this.versions[i] = true;
            } else {
                this.versions[i] = false;
            }
        }
    }

    public int getLength() {
        return length;
    }

    private boolean isBadVersion(int version) {
        return versions[version];
    }

    protected int firstBadVersion(int n) {
        int leftPointer = 0;
        int rightPointer = n - 1;

        while(leftPointer <= rightPointer){
            int midPointer = leftPointer + (rightPointer - leftPointer) / 2;
            System.out.println("Is bad version " + midPointer + " " + isBadVersion(midPointer));
            if(isBadVersion(midPointer)) {
                rightPointer = midPointer - 1;
            } else {
                leftPointer = midPointer + 1;
            }
        }

        return leftPointer;
    }

    @Override
    public String toString() {
        return "VersionControl{" +
                "versions=" + Arrays.toString(versions) +
                '}';
    }
}
