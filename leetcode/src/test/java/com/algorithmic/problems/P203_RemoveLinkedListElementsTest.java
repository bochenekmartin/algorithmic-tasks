package com.algorithmic.problems;

import com.algorithmic.model.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P203_RemoveLinkedListElementsTest {

    P203_RemoveLinkedListElements test = new P203_RemoveLinkedListElements();

    @Test
    void removeElements1() {
        assertThat(test.removeElements(new ListNode(5), 5)).isNull();
    }

    @Test
    void removeElements0() {
        ListNode head = new ListNode(5);
        head.next = new ListNode(6);

        assertThat(test.removeElements(head, 5).val).isEqualTo(6);
    }

    @Test
    void removeElements3() {
        ListNode head = new ListNode(7);
        head.next = new ListNode(5);

        assertThat(test.removeElements(head, 5).val).isEqualTo(7);
    }

    @Test
    void removeElements2() {
        ListNode head = new ListNode(5);
        ListNode next = new ListNode(6);
        next.next = new ListNode(7);
        head.next = next;

        ListNode listNode = test.removeElements(head, 6);

        assertThat(listNode.val).isEqualTo(5);
        assertThat(listNode.next.val).isEqualTo(7);
    }
}