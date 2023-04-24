package com.fxf.demo9.day20220907;

public class Main3 {
    public static void main(String[] args) {

        int[] nums = new int[]{6,1,1,1};
        int target = 0;
        System.out.println(test(nums, target));
    }

    public static int  test(int[] nums,int target){
        int number = nums[target];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == target){
                result += number;
            }
            if (i < target){
                if (nums[i] > number){
                    result += number;
                }else {
                    result += nums[i];
                }
            }
            if (i > target){
                if (nums[i] >= number - 1){
                    result +=  number - 1;
                }else {
                    result += nums[i];
                }
            }
        }
        return result * 10;
    }
}
