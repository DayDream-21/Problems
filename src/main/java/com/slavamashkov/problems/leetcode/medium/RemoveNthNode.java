package com.slavamashkov.problems.leetcode.medium;

import com.slavamashkov.problems.leetcode.ListNode;

/**
 * <h3>19. Remove Nth Node From End of List</h3>
 *
 * <p>Given the {@code head} of a linked list, remove the {@code nth} node from the end of the list and return
 * its head.</p>
 */

public class RemoveNthNode {
    public static void main(String[] args) {
        ListNode ln5 = new ListNode(5, null);
        ListNode ln4 = new ListNode(4, ln5);
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode ln1 = new ListNode(1, ln2);

        removeNthFromEnd(ln1, 2);

        while (ln1 != null) {
            System.out.println(ln1.val);
            ln1 = ln1.next;
        }
    }

    protected static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;

        ListNode slow = dummy_head;
        ListNode fast = dummy_head;

        // Move fast pointer util distance between slow and fast became n
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        // Move two pointers together until fast pointer reaches the end
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy_head.next;
    }
}
