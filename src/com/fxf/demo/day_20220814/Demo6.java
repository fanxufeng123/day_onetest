package com.fxf.demo.day_20220814;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n< 25){
            System.out.println(0);
        }else if (n >= 25 && n < 125){
            System.out.println(1);
        }else if (n >= 125 && n < 225){
            System.out.println(2);
        }else {
            int count = 2;
            for (int i = 225; i <= n; i++) {
                String str = String.valueOf(i);
                for (int j = 0; j < str.length() - 1; j++) {
                    if (str.charAt(j) == '2' && str.charAt(j + 1) == '5'){
                        count++;
                        continue;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
