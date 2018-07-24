package com.algorithmic.problems;

import com.algorithmic.model.TreeNode;
import org.junit.jupiter.api.Test;

import static com.algorithmic.utils.Trees.createT1;
import static com.algorithmic.utils.Trees.createT2;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P100_SameTreeTest {

    P100_SameTree test = new P100_SameTree();

    @Test
    void isSameTree() {
        TreeNode t11 = createT1();
        TreeNode t12 = createT1();
        TreeNode t21 = createT2();
        TreeNode t22 = createT2();

        assertTrue(test.isSameTree(t11, t12));
        assertFalse(test.isSameTree(t21, t12));
        assertTrue(test.isSameTree(t21, t22));
    }

}