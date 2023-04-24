package com.fxf.demo.day_20220731;

public class Demo1 {
    public static void main(String[] args) {
//        int[][] obstacleGrid = new int[][]{{0,0,0},{0,1,0},{0,0,0}};
        int[][] obstacleGrid = new int[][]{{1,0},{0,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));

    }

    //    确定dp数组（dp table）以及下标的含义
    //    确定递推公式
    //    dp数组如何初始化
    //    确定遍历顺序
    //    举例推导dp数组
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length, m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];

        for (int i = 0; i < m; i++) {
            if (obstacleGrid[0][i] == 1) break; //一旦遇到障碍，后续都到不了
            dp[0][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            if (obstacleGrid[i][0] == 1) break; ////一旦遇到障碍，后续都到不了
            dp[i][0] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (obstacleGrid[i][j] == 1) continue;
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[n - 1][m - 1];
    }
}
