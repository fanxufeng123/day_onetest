package com.fxf.demo9.day20220912;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(jisuan(nums));
    }
    public static boolean jisuan(int[] nums){
        int flag = nums[0];
        for (int i = 0; i <= flag; i++) {
            int temp = nums[i];
            if (temp + i > flag){
                flag = temp + i;
            }
            if (flag >= nums.length){
                return true;
            }
        }
        return false;
    }
}
