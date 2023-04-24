package com.fxf.demo.day_20220818;

public class Demo1 {
    public static void main(String[] args) {
        int[] price = new int[]{8,9,3,5,1,3};
        System.out.println(maxProfit(price));


    }
    public static int maxProfit (int[] prices) {
        // write code here
        int length = prices.length;
        int[][] dp = new int[length][5];
        dp[0][1] = -prices[0];
        dp[0][2] = 0;
        dp[0][3] = -prices[0];
        dp[0][4] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][1] = Math.max(dp[i - 1][1],dp[i - 1][0]  - prices[i]);
            dp[i][2] = Math.max(dp[i - 1][2],dp[i - 1][1] + prices[i]);
            dp[i][3] = Math.max(dp[i - 1][3],dp[i - 1][2] - prices[i]);
            dp[i][4] = Math.max(dp[i - 1][4],dp[i - 1][3] + prices[i]);
        }
        return dp[dp.length - 1][4];
    }

}
