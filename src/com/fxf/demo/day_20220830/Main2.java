package com.fxf.demo.day_20220830;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int[][] nums = new int[q][3];
        for (int i = 0; i < q; i++) {
            nums[i][0] = scanner.nextInt();
            nums[i][1] = scanner.nextInt();
            nums[i][2] = scanner.nextInt();
        }
        int[] result = new int[q];
        for (int i = 0; i < nums.length; i++) {
            int y = nums[i][0];
            int o = nums[i][1];
            int u = nums[i][2];
            int count = 0;
            int min_temp = y > o ? o : y;
            int min = min_temp > u ? u : min_temp;
            count = min * 2;
            o -= min;
            if (o != 0){
                result[i] = count + o - 1;
                continue;
            }
            result[i] = count;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        };
    }
}
