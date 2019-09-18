package com.cisco.test;


public class StockMarketDemo {
    public static void main (String[] args) {

        int[] prices = {7, 10, 4};
        int budget = 100;
        System.out.println ( computeStockPurchase ( prices, budget ) );
    }

    private static int computeStockPurchase (int[] prices, int k) {

        int result = 0;
        int numberOfStocks = 0;
        for (int i = 0; i < prices.length; i++) {
            if (k > prices[i] * (i + 1)) {
                k = k - (prices[i] * (i + 1));
                numberOfStocks += (i + 1);
            } else {
                k = k - prices[i];
                numberOfStocks += 1;
            }
        }
        return numberOfStocks;
    }
}
