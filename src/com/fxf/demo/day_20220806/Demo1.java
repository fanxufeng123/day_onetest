package com.fxf.demo.day_20220806;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[][] arr = new int[t][2];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int[] reesult = new int[t];
        for (int i = 0; i < t; i++) {
            int A = arr[i][0];
            int B = arr[i][1];
            int count = 0;
            while (A != 0 && B != 0 && (A + B) >= 3){
                count++;
                if (A > B){
                    A = A - 2;
                    B = B - 1;
                }else if (A < B){
                    A = A - 1;
                    B = B - 2;
                }else {
                    A--;
                    B--;
                }
            }
            reesult[i] = count;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(reesult[i]);
        }


    }
}
