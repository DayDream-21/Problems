package com.slavamashkov.problems.leetcode.easy;

/**
 * <h3>876. Middle of the Linked List</h3>
 *
 * <p>Given the {@code head} of a singly linked list, return the <i>middle node of the linked list</i>.</p>
 *
 * <p>If there are two middle nodes, return <b>the second middle</b> node.</p>
 */

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        ListNode ln8 = new ListNode(8, null);
        ListNode ln7 = new ListNode(7, ln8);
        ListNode ln6 = new ListNode(6, ln7);
        ListNode ln5 = new ListNode(5, ln6);
        ListNode ln4 = new ListNode(4, ln5);
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode ln1 = new ListNode(1, ln2);

        System.out.println(middleNode(ln1));
    }

    protected static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // Fast pointer iterates through all nodes 2 times faster than slow.
        // This means that when fast pointer reaches the last node (or null),
        // the slow pointer will point to the middle node (or node after the middle).
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
