package com.algorithmic.problems.algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class BestProfitTest {

    private final BestProfit underTest = new BestProfit();

    @Test
    void shouldCalculateBestProfit() {
        //given
        int[] stockPricesYesterday = {38, 37, 35, 31, 20, 24, 35, 21, 24, 21, 23, 20, 23, 25, 27};

        //when
        int maxProfit = underTest.getMaxProfit(stockPricesYesterday);

        //then
        assertThat(maxProfit).isEqualTo(15);
    }

    @Test
    void shouldCalculateBestProfitOptimal() {
        //given
        int[] stockPricesYesterday = {38, 37, 35, 31, 20, 24, 35, 21, 24, 21, 23, 20, 23, 25, 27};

        //when
        int result = underTest.getMaxProfitOptimal(stockPricesYesterday);

        //then
        assertThat(result).isEqualTo(15);
    }
}