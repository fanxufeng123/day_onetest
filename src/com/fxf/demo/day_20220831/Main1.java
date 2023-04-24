package com.fxf.demo.day_20220831;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        int max = 0;
        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            max = nums[i];
            min = nums[i];
            for (int j = i; j < nums.length; j++) {
                int temp = nums[j];
                if (max < temp)
                    max = temp;
            }
        }
    }
}
