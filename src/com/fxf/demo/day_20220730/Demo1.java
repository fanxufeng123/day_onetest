package com.fxf.demo.day_20220730;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(fib(4));


    }

    public static int fib(int n) {
        if (n < 2){
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n ; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


//    确定dp数组（dp table）以及下标的含义
//    确定递推公式
//    dp数组如何初始化
//    确定遍历顺序
//    举例推导dp数组


}
