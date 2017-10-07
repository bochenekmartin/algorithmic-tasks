package com.algorythmic.tasks.problems.leetcode.algorithms;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() throws Exception {
        //given
        AddTwoNumbers.ListNode n1 = new AddTwoNumbers.ListNode(2);
        n1.next = new AddTwoNumbers.ListNode(4);
        n1.next.next = new AddTwoNumbers.ListNode(3);

        AddTwoNumbers.ListNode n2 = new AddTwoNumbers.ListNode(5);
        n2.next = new AddTwoNumbers.ListNode(6);
        n2.next.next = new AddTwoNumbers.ListNode(4);

        //when
        AddTwoNumbers.ListNode result = new AddTwoNumbers().addTwoNumbers(n1, n2);

        //then
        assertThat(result.val).isEqualTo(7);
        assertThat(result.next.val).isEqualTo(0);
        assertThat(result.next.next.val).isEqualTo(8);
    }

}