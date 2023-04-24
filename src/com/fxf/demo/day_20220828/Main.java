package com.fxf.demo.day_20220828;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int id = scanner.nextInt();
        int[][] nums = new int[n][m];
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = scanner.nextInt();
                score[i] += nums[i][j];
            }
        }
        int result = score[id - 1];
        int temp = 0;
        for (int i = 0; i < id - 1; i++) {
            if (score[i] == result){
                temp++;
            }
        }
        Arrays.sort(score);
        int count = 0;
        for (int i = score.length - 1; i >= 0; i--) {
            if (score[i] > result){
                count++;
            }
        }
        System.out.println(temp + count + 1);
    }
}
