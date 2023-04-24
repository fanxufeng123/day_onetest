package com.fxf.demo.day_20220807;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '/'){
                result++;
            }
        }
        System.out.println(result);


    }
}
