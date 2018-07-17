package com.algorithmic.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P02_AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
        //given
        P02_AddTwoNumbers.ListNode n1 = new P02_AddTwoNumbers.ListNode(2);
        n1.next = new P02_AddTwoNumbers.ListNode(4);
        n1.next.next = new P02_AddTwoNumbers.ListNode(3);

        P02_AddTwoNumbers.ListNode n2 = new P02_AddTwoNumbers.ListNode(5);
        n2.next = new P02_AddTwoNumbers.ListNode(6);
        n2.next.next = new P02_AddTwoNumbers.ListNode(4);

        //when
        P02_AddTwoNumbers.ListNode result = new P02_AddTwoNumbers().addTwoNumbers(n1, n2);

        //then
        assertThat(result.val).isEqualTo(7);
        assertThat(result.next.val).isEqualTo(0);
        assertThat(result.next.next.val).isEqualTo(8);
    }

}