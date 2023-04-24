package com.fxf.demo.day_20220828;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long K = scanner.nextLong();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] * nums[i] >= K){
                result += (nums.length - i) * (nums.length - i - 1) / 2;
                break;
            }
            for (int j = i + 1; j < n; j++) {
                if (nums[i] * nums[j] >= K){
                    result++;
                }
            }
        }
        System.out.println(result * 2);
    }
}
