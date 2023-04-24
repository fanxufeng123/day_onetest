package com.fxf.demo.day_20220812;

public class Demo2 {
    public static void main(String[] args) {

    }

    public static int maxUncrossedLines(int[] nums1, int[] nums2) {

        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        int result = 0;

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(nums1[i - 1] == nums2[j - 1]){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i][j - 1],dp[i - 1][j]);
                }
                if (dp[i][j] > result){
                    result = dp[i][j];
                }
            }
        }

        return result;


    }
}
