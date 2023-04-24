package com.fxf.demo.day_20220802;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        int[] stones = new int[]{2,7,4,1,8,1};
        System.out.println(lastStoneWeightII(stones));

    }

    public static int lastStoneWeightII(int[] stones) {
        Arrays.sort(stones);
        int sum = 0;
        for (int i = 0; i < stones.length; i++) {
            sum += stones[i];
        }
        int maxcount = sum / 2;
        int[][] dp = new int[stones.length + 1][maxcount + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (stones[i - 1] > j){
                    dp[i][j] = dp[i - 1][j];
                    continue;
                }
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - stones[i -1]] + stones[i - 1]);
            }
        }
        int maxNumber = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i][dp[0].length - 1] > maxNumber){
                maxNumber = dp[i][dp[0].length - 1];
            }
        }

        return Math.abs((sum - maxNumber) - maxNumber);
    }
}
