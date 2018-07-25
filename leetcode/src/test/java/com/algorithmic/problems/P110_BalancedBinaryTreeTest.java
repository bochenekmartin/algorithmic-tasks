package com.algorithmic.problems;

import com.algorithmic.utils.Trees;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P110_BalancedBinaryTreeTest {

    P110_BalancedBinaryTree test = new P110_BalancedBinaryTree();

    @Test
    void isBalanced() {
        assertFalse(test.isBalanced(Trees.createUnbalancedTree()));
        assertTrue(test.isBalanced(Trees.createT1()));
        assertTrue(test.isBalanced(Trees.createT2()));
        assertTrue(test.isBalanced(Trees.createSymmetric2()));
        assertTrue(test.isBalanced(Trees.createT4()));
        assertFalse(test.isBalanced(Trees.createSymmetric()));
    }
}