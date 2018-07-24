package com.algorithmic.problems;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P692_TopKFrequentWordsTest {

    P692_TopKFrequentWords test = new P692_TopKFrequentWords();

    @Test
    void topKFrequent() {
        assertThat(test.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2))
                .isEqualTo(ImmutableList.of("i", "love"));
        assertThat(test.topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4))
                .isEqualTo(ImmutableList.of("the", "is", "sunny", "day"));
    }
}