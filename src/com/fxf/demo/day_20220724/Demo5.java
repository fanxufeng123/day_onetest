package com.fxf.demo.day_20220724;

public class Demo5 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,0,1,4};
        int jump = jump(nums);
        System.out.println(jump);
    }

    public static int jump(int[] nums) {
        if (nums.length == 1){
            return 0;
        }
        int result = 0;
        int temp = 0;
        int flag = 0;
        for (int i = 0; i <= flag; i++) {
            int end = i + nums[i];
            if (end > temp){
                temp = end;
                if (temp >= nums.length - 1){
                    return result + 1;
                }
            }
            if (i == flag){
                flag = temp;
                result++;
            }

        }
        return 0;
    }
}
