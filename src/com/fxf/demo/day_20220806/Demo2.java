package com.fxf.demo.day_20220806;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] arr = new int[t];
        int count = 0;
        int fuNumber = 0;
        for (int i = 0; i < t; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] == 0){
                count++;
            }
            if (arr[i] < 0){
                fuNumber++;
            }
        }
        int[] arr_result = new int[t - count];
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                arr_result[flag] = arr[i];
                flag++;
            }
        }
        int front = 0;
        int end = fuNumber;
        int result = fuNumber;
        for (int i = 0; i < arr_result.length - 1; i++) {
            if (arr_result[i] < 0){
                end--;
                if (front + end < result){
                    result = front + end;
                }
            }else if (arr_result[i] > 0){
                front++;
                if (front + end < result){
                    result = front + end;
                }
            }
        }
        System.out.println(result + count);
    }

}
