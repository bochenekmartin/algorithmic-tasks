package com.algorythmic.tasks.problems.hackerrank.algorithms;

public class BestProfit {

    public static void main(String[] args) {
        int prices[] = {38, 37, 35, 31, 20, 24, 35, 21, 24, 21, 23, 20, 23, 25, 27};

        int min = prices[0], max = 0;
        for (int i = 1; i < prices.length - 1; i++) {

            min = Math.min(min, prices[i]);

            max = Math.max(prices[i] - min, max);
        }

        System.out.println(max);
    }


    public static void main2(String[] args) {
//        int[] stock_prices_yesterday = {10, 7, 5, 8, 11, 9};
        int[] stock_prices_yesterday = {38, 37, 35, 31, 20, 24, 35, 21, 24, 21, 23, 20, 23, 25, 27};
        System.out.println(get_max_profit(stock_prices_yesterday));
    }

    private static int get_max_profit(int[] stock_prices_yesterday) {
        int bestDeal = -1;
        for (int i = 0; i < stock_prices_yesterday.length - 1; i++) {
            int buy = stock_prices_yesterday[i];
            for (int j = i + 1; j < stock_prices_yesterday.length; j++) {
                int sell = stock_prices_yesterday[j];
                int result = sell - buy;
                if (bestDeal < result) {
                    bestDeal = result;
                }
            }
        }
        return bestDeal;
    }
}
