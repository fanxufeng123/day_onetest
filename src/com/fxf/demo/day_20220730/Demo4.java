package com.fxf.demo.day_20220730;

public class Demo4 {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        System.out.println(uniquePaths(m,n));


    }

    //    确定dp数组（dp table）以及下标的含义
    //    确定递推公式
    //    dp数组如何初始化
    //    确定遍历顺序
    //    举例推导dp数组
    public static int uniquePaths(int m, int n) {
        if (m == 1 || n == 1){
            return 1;
        }
        int[][] dp = new int[m][n];
        dp[0][0] = 0;
        for (int i = 1; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }

        return dp[m - 1][n - 1];

    }
}
