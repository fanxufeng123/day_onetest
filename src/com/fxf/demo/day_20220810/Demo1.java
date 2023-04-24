package com.fxf.demo.day_20220810;

public class Demo1 {
    public static void main(String[] args) {
        int[] prices = new int[]{1,2,3,4,5};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int length = prices.length;
        if (length == 1){
            return 0;
        }
        int[][] dp = new int[length][5];
        dp[0][1] = -prices[0];
        dp[0][3] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][1] = Math.max(dp[i - 1][0] - prices[i], dp[i - 1][1]);
            dp[i][2] = Math.max(dp[i - 1][1] + prices[i], dp[i - 1][2]);
            dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] - prices[i]);
            dp[i][4] = Math.max(dp[i - 1][4], dp[i - 1][3] + prices[i]);


        }

        return dp[length - 1][4];
    }
}
