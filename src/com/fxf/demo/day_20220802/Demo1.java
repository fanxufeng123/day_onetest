package com.fxf.demo.day_20220802;

public class Demo1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,5,9,11};
        System.out.println(canPartition(nums));

    }

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0){
            return false;
        }
        int maxSum = sum / 2; //找到和为该数得子集
        int[][] dp = new int[nums.length][maxSum + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (nums[i  -1] > j){
                    dp[i][j] = dp[i - 1][j];
                    continue;
                }
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - nums[i -1]] + nums[i - 1]);
            }
            if (dp[i][dp[0].length - 1] == maxSum){
                return true;
            }else if(dp[i][dp[0].length - 1] > maxSum){
                return false;
            }
        }
        return false;
    }
}
