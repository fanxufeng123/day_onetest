package com.fxf.demo.day_20220831;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] nums = new int[m][3];
        for (int i = 0; i < nums.length; i++) {
            nums[i][0] = scanner.nextInt();
            nums[i][1] = scanner.nextInt();
            nums[i][2] = scanner.nextInt();
        }

        int[] resultFlag = new int[n];
        for (int i = 0; i < m; i++) {
            int front = nums[i][0] - 1;
            int end = nums[i][1] - 1;
            for (int j = front; j <= end; j++) {
                resultFlag[j]++;
            }
        }

    }
}
