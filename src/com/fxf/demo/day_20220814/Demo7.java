package com.fxf.demo.day_20220814;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] nums = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }

        int resultNumber = 0;
        int number1 = 0;
        int number2 = 0;
        for (int i = 0; i < n; i++) {
            int temp1 = nums[i][1];
            int temp2 = nums[i][2];
            for (int j = i + 1; j < n; j++) {
                int a = nums[j][1];
                int b = nums[j][2];
                if (a >= temp2 || b <= temp1){
                    if (nums[i][0] + nums[j][0] > resultNumber){
                        resultNumber = nums[i][0] + nums[j][0];
                        number1 = i;
                        number2 = j;
                    }
                }
            }
        }
        System.out.println(number1);
        System.out.println(number2);
    }
}
//8 3
//        3 0 6
//        1 1 4
//        4 3 5
//        17 3 8
//        9 4 7
//        10 5 9
//        8 6 10
//        1 8 11
