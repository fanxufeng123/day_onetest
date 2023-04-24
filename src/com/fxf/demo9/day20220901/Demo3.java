package com.fxf.demo9.day20220901;

public class Demo3 {
    public static void main(String[] args) {
        int amount = 5;
        int[] coins = new int[]{1,2,5};

        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j < dp.length; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        System.out.println(dp[dp.length - 1]);
    }
}
