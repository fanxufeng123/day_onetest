package com.fxf.demo.day_20220805;

public class Demo {
    public static void main(String[] args) {
        int[] coins = new int[]{3};
        int amount = 2;
        System.out.println(change(amount,coins));

    }

    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        //dp[x] 表示金额之和等于 xx 的硬币组合数
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[amount];

    }

}
