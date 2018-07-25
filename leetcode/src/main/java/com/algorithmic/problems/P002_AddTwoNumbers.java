package com.algorithmic.problems;

import com.algorithmic.model.ListNode;

import java.math.BigInteger;

public class P002_AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger result = toInt(l1).add(toInt(l2));
        return fromInt(result);
    }

    private ListNode fromInt(BigInteger number) {
        String s = number.toString();
        char[] chars = s.toCharArray();
        ListNode result = null;
        ListNode last = null;

        for (int i = chars.length - 1; i >= 0; i--) {
            String character = Character.toString(chars[i]);
            ListNode listNode = new ListNode(Integer.parseInt(character));
            if (result == null) {
                result = listNode;
                last = result;
            } else {
                last.next = listNode;
                last = listNode;
            }
        }
        return result;
    }

    private BigInteger toInt(ListNode node) {
        StringBuilder builder = new StringBuilder();
        ListNode last = node;

        while (last != null) {
            builder.append(last.val);
            last = last.next;
        }
        return new BigInteger(builder.reverse().toString());
    }

}
