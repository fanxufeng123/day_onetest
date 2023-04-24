package com.fxf.demo.day_20220816;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] split = input.nextLine().split(",");
        int[] nums = new int[split.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.valueOf(split[i]);
        }
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] < 0){
                result += nums[i] - nums[i - 1];
            }
        }
        System.out.println(-result);
    }
}
