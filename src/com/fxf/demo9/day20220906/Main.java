package com.fxf.demo9.day20220906;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] target = new int[3];
        for (int i = 0; i < 3; i++) {
            target[i] = scanner.nextInt();
        }
        Arrays.sort(target);
        int n = scanner.nextInt();
        int[][] nums = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int[] temp = nums[i];
            Arrays.sort(temp);
            if (temp[0] + temp[1] > temp[2] && temp[2] - temp[0] < temp[1]){
                if (((double)temp[0] / (double)target[0] == (double)temp[1] / (double)target[1]) && ((double)temp[2] / (double)target[2] == (double)temp[1] / (double)target[1])){
                    System.out.println("similar");
                    continue;
                }
                else {
                    System.out.println("Can form a triangle but not a similar");
                    continue;
                }
            }
            System.out.println("Can form a triangle");
        }
    }
}
