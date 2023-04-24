package com.fxf.demo.day_20220823;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = sc.nextInt();

        int result = 0;
        for (int i = 1; i < n + 1; i++) {
            String s = String.valueOf(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) - '0' == flag){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
