package com.slavamashkov.problems;

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

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
    }

    @Override
    public String toString() {
        return val + " " + next + " ";
    }
}
