package com.fxf.demo.day_20220731;

public class Demo2 {

    public static void main(String[] args) {
        System.out.println(integerBreak(58));

    }

    public static int integerBreak(int n) {
        if (n <= 3){
            return n - 1;
        }
        int[] dp = new int[n - 1];
        dp[0] = 2;
        dp[1] = 3;
        for (int i = 2; i < dp.length; i++) {
            if (dp[i - 1] % 2 == 0){
                dp[i] = dp[i - 1] / 2 * 3;
            }else {
                dp[i] = dp[i - 1] /3 * 4;
            }
        }

        return dp[dp.length - 1];
    }
}
