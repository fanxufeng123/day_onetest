package com.fxf.demo.day_20220826;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toUpperCase();
        char target = scanner.nextLine().toUpperCase().charAt(0);
        int reuslt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (target == s.charAt(i))
                reuslt++;
        }
        System.out.println(reuslt);
    }
}
