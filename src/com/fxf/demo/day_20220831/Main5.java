package com.fxf.demo.day_20220831;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[m][3];
        for (int i = 0; i < array.length; i++) {
            array[i][0] = scanner.nextInt();
            array[i][1] = scanner.nextInt();
            array[i][2] = scanner.nextInt();
        }
        Arrays.sort(array,(a,b) -> {
            return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
        });
        int right = 0;
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] > right){
                res += array[i][0] - right - 1;
                res += array[i][2];
                right = array[i][1];
            }else {
                int gap = array[i][1] - right;
                if (gap > 0){
                    res += Math.min(gap,array[i][2]);
                    right = array[i][1];
                }
            }
        }
        res += (n - right);
        System.out.println(res);
    }
}
