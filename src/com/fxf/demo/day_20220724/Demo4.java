package com.fxf.demo.day_20220724;

public class Demo4 {
    public static void main(String[] args) {

        int[] nums = new int[]{2,3,1,1,4};
        boolean b = canJump(nums);
        System.out.println(b);
    }

    public static boolean canJump(int[] nums) {
        int flag = 0; //表示下标
        for (int i = 0; i <= flag; i++) {
            int end = nums[i] + i;
            if (end > flag){
                flag = end;
            }
            if (end >= nums.length - 1){
                return true;
            }

        }

        return false;
    }
}
