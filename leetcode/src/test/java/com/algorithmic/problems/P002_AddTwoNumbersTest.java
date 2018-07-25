package com.algorithmic.problems;

import com.algorithmic.model.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P002_AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
        //given
        ListNode n1 = new ListNode(2);
        n1.next = new ListNode(4);
        n1.next.next = new ListNode(3);

        ListNode n2 = new ListNode(5);
        n2.next = new ListNode(6);
        n2.next.next = new ListNode(4);

        //when
        ListNode result = new P002_AddTwoNumbers().addTwoNumbers(n1, n2);

        //then
        assertThat(result.val).isEqualTo(7);
        assertThat(result.next.val).isEqualTo(0);
        assertThat(result.next.next.val).isEqualTo(8);
    }

}