package com.fxf.demo.day_20220730;

public class Demo3 {
    public static void main(String[] args) {
        int[] cost = new int[]{1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost));

    }

    //    确定dp数组（dp table）以及下标的含义
    //    确定递推公式
    //    dp数组如何初始化
    //    确定遍历顺序
    //    举例推导dp数组
    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];   //到达该点之后再起跳最小值
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            int temp = Math.min(dp[i - 1],dp[i - 2]);
            dp[i] = cost[i] + temp;
        }

        return Math.min(dp[dp.length - 1],dp[dp.length - 2]);

    }
}
