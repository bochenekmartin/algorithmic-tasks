package com.algorithmic.problems;

import com.algorithmic.model.TreeNode;
import org.junit.jupiter.api.Test;

import static com.algorithmic.utils.Trees.createSymmetric2;
import static com.algorithmic.utils.Trees.createT2;
import static com.algorithmic.utils.Trees.createT4;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P101_SymmetricTreeTest {

    P101_SymmetricTree test = new P101_SymmetricTree();

    @Test
    void isSymmetric() {
        TreeNode symmetric = createSymmetric2();
        TreeNode notSymmetric = createT2();
        TreeNode notSymmetric2 = createT4();

        assertTrue(test.isSymmetric(symmetric));
        assertFalse(test.isSymmetric(notSymmetric));
        assertFalse(test.isSymmetric(notSymmetric2));
    }
}