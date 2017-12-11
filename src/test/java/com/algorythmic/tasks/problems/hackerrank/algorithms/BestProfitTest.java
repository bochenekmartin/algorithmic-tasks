package com.algorythmic.tasks.problems.hackerrank.algorithms;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class BestProfitTest {

    private final BestProfit underTest = new BestProfit();

    @Test
    public void shouldCalculateBestProfit() {
        //given
        int[] stockPricesYesterday = {38, 37, 35, 31, 20, 24, 35, 21, 24, 21, 23, 20, 23, 25, 27};

        //when
        int maxProfit = underTest.getMaxProfit(stockPricesYesterday);

        //then
        assertThat(maxProfit).isEqualTo(15);
    }

    @Test
    public void shouldCalculateBestProfitOptimal() {
        //given
        int[] stockPricesYesterday = {38, 37, 35, 31, 20, 24, 35, 21, 24, 21, 23, 20, 23, 25, 27};

        //when
        int result = underTest.getMaxProfitOptimal(stockPricesYesterday);

        //then
        assertThat(result).isEqualTo(15);
    }
}