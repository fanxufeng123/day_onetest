package com.fxf.demo9.day20220918;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,2,1,-4};
        int target = 2;
        System.out.println(ClosestSum(nums, target));

    }

    public static int ClosestSum (int[] nums, int target) {
        // write code here
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        int flag = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (Math.abs(nums[i] + nums[j] + nums[k] - target) < Math.abs(flag)){
                        result = nums[i] + nums[j] + nums[k];
                        flag = nums[i] + nums[j] + nums[k] - target;
                    }
                }
            }
        }
        return result;
    }
}
