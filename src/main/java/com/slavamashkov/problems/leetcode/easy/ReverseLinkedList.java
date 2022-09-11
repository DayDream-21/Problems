package com.slavamashkov.problems.leetcode.easy;

import com.slavamashkov.problems.leetcode.ListNode;

/**
 * <h3>206. Reverse Linked List</h3>
 *
 * <p>Given the {@code head} of a singly linked list, reverse the list, and return <i>the reversed list</i>.</p>
 */

public class ReverseLinkedList {
    public static void main(String[] args) {

    }

    /**
     * <ul>
     *     <li>
     *          Time complexity: O(N)
     *          <p>N - amount of nodes in linked list</p>
     *     </li>
     *     <li>
     *         Space complexity: O(1)
     *     </li>
     * </ul>
     */
    private static ListNode reverseListIteratively(ListNode head) {
        ListNode previous_node = null;

        while (head.next != null) {
            ListNode next_node = head.next;
            head.next = previous_node;
            previous_node = head;
            head = next_node;
        }

        return previous_node;
    }

    private static ListNode reverseListRecursivelyAdapter(ListNode head) {
        return reverseListRecursively(head, null);
    }

    private static ListNode reverseListRecursively(ListNode head, ListNode newHead) {
        if (head == null) {
            return newHead;
        }

        ListNode next = head.next;
        head.next = newHead;

        return reverseListRecursively(next, head);
    }
}
