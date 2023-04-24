package com.fxf.demo.day_20220807;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[t][n];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 2 == 0){
                    arr[i][j] = arr[i][j] - 1;
                    continue;
                }
                arr[i][j] = arr[i][j] + 1;
            }
        }
        System.out.println();



    }

}
