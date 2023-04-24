package com.fxf.demo.day_20220830;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
            temp[i] = nums[i];
        }

        int maxNumber = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] - nums[i - 1] > maxNumber){
                maxNumber = Math.abs(nums[i] - nums[i - 1]);
            }
        }

        for (int i = 1; i < n; i++) {
            if (nums[i] - nums[i - 1] == maxNumber){
                int count = fourNumber(nums[i - 2], nums[i - 1], nums[i], nums[i + 1],maxNumber);
            }
        }

    }
    public static int fourNumber(int a,int b,int c,int d,int maxNumber){
        int number1 = Math.abs(c - a);   //改左边极值
        int number2 = Math.abs(d - b);   //改右边极值
        int number3 = Math.abs(((c + a) / 2) - a);   //改左边平均值
        int number4 = Math.abs(((b + d) / 2) - b);   //改右边平均值



        return 0;
    }
}
