package com.fxf.demo.day_20220808;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] coins = new int[]{186,419,83,408};
        int amount = 6249;
        System.out.println(coinChange(coins,amount));

    }

    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int max = Integer.MAX_VALUE;
        int[] dp = new int[amount + 1];
        //初始化dp数组为最大值
        for (int j = 0; j < dp.length; j++) {
            dp[j] = max;
        }
        //当金额为0时需要的硬币数目为0
        dp[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i < dp.length; i++) {
                if (dp[i - coin] != max){
                    dp[i] = Math.min(dp[i - coin] + 1,dp[i]);
                }
            }
        }

        return dp[amount] == max ? -1 : dp[amount];
    }
}
