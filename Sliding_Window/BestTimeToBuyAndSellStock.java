package com.problem_solving.Needcode150.Sliding_Window;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(findMaxProfit(prices));
    }
    
    public static int findMaxProfit(int[] prices) {

        int buyPrice = 0;
        int sellPrice = 1;
        int profit = 0;

        for (int i=1; i<prices.length; i++) {

            profit = Math.max(profit, prices[sellPrice] - prices[buyPrice]);

            if (prices[sellPrice] < prices[buyPrice]){
                buyPrice = sellPrice;
            }

            sellPrice++;
        }
        return profit;
    }
}
