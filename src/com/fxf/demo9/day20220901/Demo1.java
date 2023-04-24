package com.fxf.demo9.day20220901;

public class Demo1 {
    public static void main(String[] args) {
        int[] nums = new int[]{100};
        int target = -200;
        System.out.println(findTargetSumWays(nums, target));
    }
    public static int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if ((sum - target) % 2 != 0){
            return 0;
        }
        int bagSize = (sum - target) / 2 + target;
        if (Math.abs(target) > Math.abs(sum)){
            return 0;
        }
        int[] dp = new int[bagSize + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = dp.length - 1; j >=0; j--) {
                if (j >= nums[i]){
                    dp[j] += dp[j - nums[i]];
                }
            }
        }


        return dp[dp.length - 1];
    }
}
