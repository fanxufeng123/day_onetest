package com.fxf.demo.day_20220813;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        int result = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                for (int k = j + 1; k < n; k++) {
//                    if (panDuan(nums,i,j,k)){
//                        result++;
//                    }
//                }
//            }
//        }


        int ack_i = 0;
        int ack_j = 0;
        int ack_k = 0;
        for (int j = 1; j < n - 1; j++) {
            ack_j = nums[j];
            for (int i = 0; i < j; i++) {
                ack_i = nums[i];
                for (int k = j + 1; k < n; k++) {
                    ack_k = nums[k];
                    if (3 * ack_j == ack_i + ack_k){
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }

    private static boolean panDuan(int[] nums, int i, int j, int k) {
        return nums[i] - nums[j] == 2 * nums[j] - nums[k];
    }
}
