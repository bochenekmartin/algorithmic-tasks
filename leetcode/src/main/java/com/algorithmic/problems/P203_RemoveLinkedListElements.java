package com.algorithmic.problems;

import com.algorithmic.model.ListNode;

public class P203_RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        while (head.val == val) {
            head = head.next;
            if (head == null) {
                return null;
            }
        }
        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null) {
            if (curr.val == val) {
                //delete
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }

}
