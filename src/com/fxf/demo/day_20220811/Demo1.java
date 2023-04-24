package com.fxf.demo.day_20220811;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,4,7};
        System.out.println(findLengthOfLCIS(nums));

    }

    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length == 1){
            return 1;
        }
        int length = nums.length;
        int[] dp = new int[length];
        Arrays.fill(dp,1);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]){
                dp[i] = dp[i - 1] + 1;
            }
        }
        int result = 0;
        for (int i = 0; i < dp.length; i++) {
            if (result < dp[i]){
                result = dp[i];
            }
        }

        return result;
    }
}
