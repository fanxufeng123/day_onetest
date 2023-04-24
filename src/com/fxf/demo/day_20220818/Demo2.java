package com.fxf.demo.day_20220818;

public class Demo2 {
    public static void main(String[] args) {

    }
    public static int maxProfit(int k, int[] prices) {
        if (k == 0){
            return 0;
        }
        int[][] dp = new int[prices.length][2 * k + 1];
        for (int i = 1; i < dp[0].length; i += 2) {
            dp[0][i] = -prices[0];
        }
        for (int i = 1; i < prices.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j % 2 != 0){
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i - 1][j - 1] - prices[i]);
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i - 1][j - 1] + prices[i]);
                }
            }
        }

        return dp[dp.length - 1][2 * k];
    }
}
