package com.fxf.demo9.day20220909;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        int front = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                end++;
            else
                front++;
        }
        int flag = 2;
        int result = 0;
        while (flag <= front){
            int temp = 1;
            for (int i = 0; i < flag; i++) {
                temp = temp * (front - i);
            }
            for (int i = 1; i <= flag; i++) {
                temp = temp / i;
            }
            result += temp;
            flag++;
        }
        flag = 0;
        while (flag <= end){
            int temp = 1;
            for (int i = 0; i < flag; i++) {
                temp = temp * (front - i);
            }
            for (int i = 1; i <= flag; i++) {
                temp = temp / i;
            }
            result += temp;
            flag++;
        }
        System.out.println(result);
    }
}
