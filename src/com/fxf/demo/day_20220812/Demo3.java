package com.fxf.demo.day_20220812;

public class Demo3 {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] <= 0){
                dp[i] = nums[i];
            }else {
                dp[i] = dp[i - 1] + nums[i];
            }
            if (result < dp[i]){
                result = dp[i];
            }
        }

        return result;
    }
}
