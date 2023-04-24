package com.fxf.demo.day_20220804;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[][] arr = new int[t][6];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        String[] result = new String[t];
        for (int i = 0; i < t; i++) {
            int timeA = 0, timeB = 0;
            if (arr[i][2] % arr[i][0] == 0){
                timeA = (arr[i][2] / arr[i][0] - 1) * arr[i][1];
            }else {
                timeA = (arr[i][2] / arr[i][0]) * arr[i][1];
            }
            if (arr[i][5] % arr[i][3] == 0){
                timeB = (arr[i][5] / arr[i][3] - 1) * arr[i][4];
            }else {
                timeB = (arr[i][5] / arr[i][3]) * arr[i][4];
            }
            if (timeA > timeB){
                result[i] = "B";
            }else if(timeA < timeB){
                result[i] = "A";
            }else {
                result[i] = "A&B";
            }
        }
        for (String s:
             result) {
            System.out.println(s);
        }
    }
}
