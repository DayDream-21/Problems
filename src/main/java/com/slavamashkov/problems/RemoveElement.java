package com.slavamashkov.problems;

public class RemoveElement {
    public static void main(String[] args) {
        int[] ints = {0, 1, 2, 2, 3, 0, 4, 2};
        int range = removeElement(ints, 2);
        System.out.println(range);

        for (int i = 0; i < range; i++) {
            System.out.print(ints[i]);
        }
    }

    private static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }

        return pointer;
    }
}
