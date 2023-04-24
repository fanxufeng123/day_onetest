package com.fxf.demo.day_20220724;

public class Demo2 {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int i = maxSubArray(nums);
        System.out.println(i);


    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int sum = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            sum = Integer.max(count,sum);
            if (count < 0){
                count = 0;
            }
        }
        return sum;
    }
}
