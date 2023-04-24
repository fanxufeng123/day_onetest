package com.fxf.demo.day_20220828;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String nStr = String.valueOf(n);
        for (int i = nStr.length() - 1; i >= 0; i--) {
            System.out.print(nStr.charAt(i));
        }
    }
}
