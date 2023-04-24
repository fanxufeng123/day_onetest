package com.fxf.demo.day_20220821;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        int front = 0;
        int end = 1;
        int result = nums[front] + nums[end];
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] + nums[front] - (i - front) > result || nums[i] + nums[end] - (i - end) > result){
                if(nums[i] + nums[front] - (i - front) > nums[i] + nums[end] - (i - end)){
                    result = nums[i] + nums[front] - (i - front);
                    end = i;
                }else {
                    result = nums[i] + nums[end] - (i - end);
                    front = i;
                }
            }

        }
        System.out.println(result);

    }
}
