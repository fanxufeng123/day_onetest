package com.fxf.demo.day_20220828;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] n = scanner.nextLine().split(" ");
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i] + " ");
        }
    }
}
