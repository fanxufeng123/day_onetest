package com.fxf.demo.day_20220820;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] == nums[k] && nums[i] > nums[j]){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
