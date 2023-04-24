package com.fxf.demo.day_20220813;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        int result = 0;
        int temp = arr[0] + t;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < temp){
                result++;
                continue;
            }
            temp += t;
        }
        System.out.println(result);
    }

}
