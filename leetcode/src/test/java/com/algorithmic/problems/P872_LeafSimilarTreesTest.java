package com.algorithmic.problems;

import com.algorithmic.utils.Trees;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P872_LeafSimilarTreesTest {

    P872_LeafSimilarTrees test = new P872_LeafSimilarTrees();

    @Test
    void leafSimilar() {
        assertTrue(test.leafSimilar(Trees.createT2(), Trees.createT2()));
        assertFalse(test.leafSimilar(Trees.createT2(), Trees.createT4()));
    }
}