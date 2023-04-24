package com.fxf.demo.day_20220809;

public class Demo3 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,4,3,2,5};
        System.out.println(rob(nums));

    }

    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int[] dp = new int[length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        boolean[] flag = new boolean[length];
        flag[0] = true;
        if (nums[1] >= nums[0]){
            flag[1] = false;
        }else {
            flag[1] = true;
        }
        for (int i = 2; i < length; i++) {
            if (dp[i - 2] + nums[i] == dp[i - 1]){
                if (flag[i - 1] == flag[i - 1] == true){
                    flag[i] = true;
                }else {
                    flag[i] = false;
                }
            }else if (dp[i - 2] + nums[i] > dp[i - 1]){
                flag[i] = flag[i - 2];
            }else {
                flag[i] = flag[i  -1];
            }
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        if (flag[length - 1] == false){
            return dp[length - 1];
        }else {
            return Math.max(dp[length - 2], dp[length - 1] - dp[0]);
        }


    }
}
