package com.fxf.demo.day_20220825;

import java.util.Map;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] nums = str.substring(1,str.length() - 1).split(",");
        int[] height = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            height[i] = Integer.parseInt(nums[i]);
        }
        System.out.println(max(height));

    }

    public static int max(int[] nums){
        if (nums.length < 2|| nums == null)
            return 0;
        int result = 0;
        int front = 0;
        int end = nums.length - 1;
        while (front < end){
            result = Math.max(result,(end - front) * Math.min(nums[front],nums[end]));
            if (nums[front] < nums[end])
                front++;
            else
                end--;
        }
        return result;
    }
}
