package com.fxf.demo.day_20220803;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] nums = new int[]{9,7,0,3,9,8,6,5,7,6};
        int target = 2;
        System.out.println(findTargetSumWays(nums,target));

    }

    public static int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int diff = sum - target;
        if (diff < 0 || diff % 2 != 0) {
            return 0;
        }
        int n = nums.length, neg = diff / 2;
        int[][] dp = new int[n + 1][neg + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= neg; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= nums[i - 1]) {
                    dp[i][j] += dp[i - 1][j - nums[i - 1]];
                }
            }
        }
        return dp[n][neg];

    }
}
