package com.fxf.demo.day_20220730;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));

    }

    //    确定dp数组（dp table）以及下标的含义
//    确定递推公式
//    dp数组如何初始化
//    确定遍历顺序
//    举例推导dp数组

    public static int climbStairs(int n) {
        if (n == 1){
            return 1;
        }else if (n == 2){
            return 2;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }


        return dp[n - 1];
    }
}
