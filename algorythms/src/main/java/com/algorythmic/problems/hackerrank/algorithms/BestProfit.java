package com.algorythmic.problems.hackerrank.algorithms;

public class BestProfit {

    int getMaxProfitOptimal(int... prices) {
        int min = prices[0], max = 0;
        for (int i = 1; i < prices.length - 1; i++) {
            min = Math.min(min, prices[i]);

            max = Math.max(prices[i] - min, max);
        }
        return max;
    }

    int getMaxProfit(int... stockPricesYesterday) {
        int bestDeal = -1;
        for (int i = 0; i < stockPricesYesterday.length - 1; i++) {
            int buy = stockPricesYesterday[i];
            for (int j = i + 1; j < stockPricesYesterday.length; j++) {
                int sell = stockPricesYesterday[j];
                int result = sell - buy;
                if (bestDeal < result) {
                    bestDeal = result;
                }
            }
        }
        return bestDeal;
    }
}
