package com.fxf.demo.day_20220810;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        int[] nums = new int[]{10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));

    }

    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 1){
            return 1;
        }
        int length = nums.length;
        int [] dp = new int[length];
        int result = 1;
        Arrays.fill(dp,1);
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if (result < dp[i]){
                result = dp[i];
            }
        }

        return result;
    }
}
