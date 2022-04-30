package com.slavamashkov.problems.leetcode.easy;

import com.slavamashkov.problems.leetcode.ListNode;

/**
 * <h3>21. Merge Two Sorted Lists</h3>
 *
 * <p>You are given the heads of two sorted linked lists {@code list1} and {@code list2}.</p>
 *
 * <p>Merge the two lists in a one <b>sorted</b> list. The list should be made by splicing together the nodes of the
 * first two lists.</p>
 *
 * <p>Return <i>the head of the merged linked list</i>.</p>
 */

public class MergeTwoSortedList {
    public static void main(String[] args) {
        ListNode listNode1_3 = new ListNode(4, null);
        ListNode listNode1_2 = new ListNode(2, listNode1_3);
        ListNode listNode1_1 = new ListNode(1, listNode1_2);

        ListNode listNode2_3 = new ListNode(4, null);
        ListNode listNode2_2 = new ListNode(3, listNode2_3);
        ListNode listNode2_1 = new ListNode(1, listNode2_2);

        System.out.println(mergeTwoLists(listNode1_1, listNode2_1));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tempNode = new ListNode(0);
        ListNode currNode = tempNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currNode.next = list1;
                list1 = list1.next;
            } else {
                currNode.next = list2;
                list2 = list2.next;
            }
            currNode = currNode.next;
        }

        if (list1 != null) {
            currNode.next = list1;
            list1 = list1.next;
        }

        if (list2 != null)  {
            currNode.next = list2;
            list2 = list2.next;
        }

        return tempNode.next;
    }
}

