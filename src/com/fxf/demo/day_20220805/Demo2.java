package com.fxf.demo.day_20220805;

public class Demo2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        int target = 4;
        System.out.println(combinationSum4(nums,target));

    }

    public static int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];

    }
}
