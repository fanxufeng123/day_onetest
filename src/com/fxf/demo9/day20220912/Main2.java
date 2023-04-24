package com.fxf.demo9.day20220912;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int a, b, c;
        int result = 0;
        a = nums[0];
        b = nums[1];
        c = nums[2];
        while (panSort(a, b, c)){
            a -= 1;
            b -= 2;
            c -= 3;
            result += 5;
        }
        for (int i = 3; i < n; i++) {
            result += a;
            a = b;
            b = c;
            c = nums[i];
            while (panSort(a, b, c)){
                a -= 1;
                b -= 2;
                c -= 3;
                result += 5;
            }
        }
        System.out.println(result + b + c);

    }

    public static boolean panSort(int a, int b, int c){
        if (a < b){
            if (b < c){
                return true;
            }
        }
        return false;
    }
}
