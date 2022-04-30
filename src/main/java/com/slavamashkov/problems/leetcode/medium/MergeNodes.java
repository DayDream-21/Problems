package com.slavamashkov.problems.leetcode.medium;

import com.slavamashkov.problems.leetcode.ListNode;

/**
 * <p>You are given the {@code head} of a linked list, which contains
 * a series of <b>integers</b> separated by {@code 0}'s. The <b>beginning</b>
 * and <b>end</b> of the linked list will have {@code Node.val == 0}.</p>
 *
 * <p>For <b>every</b> two consecutive {@code 0}'s, <b>merge</b> all the nodes
 * lying in between them into a single node whose value is the <b>sum</b> of all the
 * merged nodes. The modified list should not contain any {@code 0}'s.</p>
 *
 * <p><i>Return the<i> {@code head} <i>of the modified linked list.</i></p>
 */

public class MergeNodes {
    public static void main(String[] args) {
        ListNode ln7 = new ListNode(0, null);
        ListNode ln6 = new ListNode(2, ln7);
        ListNode ln5 = new ListNode(5, ln6);
        ListNode ln4 = new ListNode(4, ln5);
        ListNode ln3 = new ListNode(0, ln4);
        ListNode ln2 = new ListNode(1, ln3);
        ListNode ln1 = new ListNode(3, ln2);
        ListNode ln0 = new ListNode(0, ln1);

        mergeNodes(ln0);
        printListNodes(ln0);
    }

    protected static ListNode mergeNodes(ListNode head) {
        ListNode innerPointer = head;
        ListNode outerPointer = head.next;

        while (innerPointer != null && innerPointer.val != 0) {
            innerPointer = innerPointer.next;
            outerPointer = outerPointer.next;
        }

        int sum = 0;

        while (outerPointer != null) {

            sum += outerPointer.val;

            if (outerPointer.val == 0) {
                innerPointer.val = sum;
                sum = 0;

                if (outerPointer.next == null) {
                    innerPointer.next = null;
                } else {
                    outerPointer = outerPointer.next;
                    innerPointer = innerPointer.next;
                    innerPointer.next = outerPointer;
                    continue;
                }
            }

            outerPointer = outerPointer.next;
        }

        return head;
    }

    private static void printListNodes(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}



