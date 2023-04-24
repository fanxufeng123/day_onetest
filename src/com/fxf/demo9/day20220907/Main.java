package com.fxf.demo9.day20220907;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Arrays.sort(nums);
        int result = 0;
        if (nums.length - m < 0){
            System.out.println(0);
            return;
        }
        while (nums[nums.length - m] != 0){
            result += nums[nums.length - m];
            for (int i = nums.length - m + 1; i < nums.length; i++) {
                nums[i] -= nums[nums.length - m];
            }
            nums[nums.length - m] = 0;
            Arrays.sort(nums);
        }
        System.out.println(result);
    }
}
