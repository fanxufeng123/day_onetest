package com.fxf.demo.day_20220810;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        int k = 2;
        int[] prices = new int[]{2,4,1};
        System.out.println(maxProfit(k,prices));

    }

    public static int maxProfit(int k, int[] prices) {
        int length = prices.length;
        if (length == 1){
            return 0;
        }
        int[][] dp = new int[length][2*k + 1];
        for (int i = 0; i < dp[0].length; i += 2) {
            dp[0][i] = -prices[0];
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length - 2; j += 2) {
                dp[i][j + 1] = Math.max(dp[i - 1][j + 1], dp[i - 1][j] - prices[i]);
                dp[i][j + 2] = Math.max(dp[i - 1][j + 2], dp[i - 1][j + 1] + prices[i]);
            }


        }

        return dp[length - 1][k*2];
    }
}
