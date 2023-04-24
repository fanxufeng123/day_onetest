package com.fxf.demo9.day20220924;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] coins = new int[]{2};
        int amount = 3;
        System.out.println(coinChange(coins, amount));
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j < amount + 1; j++) {
                if (dp[j - coins[i]] != Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j - coins[i]] + 1,dp[j]);
                }
            }
        }
        return dp[dp.length - 1] == Integer.MAX_VALUE ? -1 : dp[dp.length - 1];
    }
}
