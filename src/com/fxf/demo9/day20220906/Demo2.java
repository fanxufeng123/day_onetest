package com.fxf.demo9.day20220906;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nums = new int[n][n];
        int count = (1 + n) * n / 2;
        int flag = 0;
        int number = 1;
        while (flag < n){
            int j = 0;
            int i = flag - j;
            while (i >= 0){
                nums[i][j] = number;
                number++;
                j++;
                i--;
            }
            flag++;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i][j] != 0){
                    System.out.print(nums[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
