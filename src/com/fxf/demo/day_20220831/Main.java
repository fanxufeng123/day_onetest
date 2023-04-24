package com.fxf.demo.day_20220831;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long result = 0;
        int flag = 1;
        for (; Math.pow(2,flag) <= n; flag++){
            result = (long)(flag * Math.pow(2,flag - 1) + result) ;
        }
        result = (long) (flag * (n - Math.pow(2,flag - 1) + 1) + result);
        System.out.println(result);
    }
}
