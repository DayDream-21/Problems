package com.slavamashkov.problems.leetcode.medium;

/**
* You are given two non-empty linked lists representing two non-negative integers.
* The digits are stored in reverse order, and each of their nodes contains a single
* digit. Add the two numbers and return the sum as a linked list.
*
* You may assume the two numbers do not contain any leading zero, except the number
* 0 itself.
* */

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode listNode_1_3 = new ListNode(3);
        ListNode listNode_1_4 = new ListNode(4, listNode_1_3);
        ListNode listNode_1_2 = new ListNode(2, listNode_1_4);

        ListNode listNode_2_4 = new ListNode(4);
        ListNode listNode_2_6 = new ListNode(6, listNode_2_4);
        ListNode listNode_2_5 = new ListNode(5, listNode_2_6);

        addTwoNumbers(listNode_1_2, listNode_2_5);
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode l3 = head;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;

            int current_sum = l1_val + l2_val + carry;
            carry = current_sum / 10;
            int last_digit = current_sum % 10;

            l3.next = new ListNode(last_digit);

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }

            l3 = l3.next;
        }

        if (carry > 0) {
            l3.next = new ListNode(carry);
            l3 = l3.next;
        }

        return head.next;
    }
}



class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

