package com.fxf.demo9.day20220906;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0; //成熟 的
        int b = 1;  //年龄为1
        int c = 0;  //年龄为2
        for (int i = 1; i < n; i++) {
            int temp = 0;
            temp = b;
            a = a + c;
            b = a;
            c = temp;
        }
        System.out.println(a + b + c);

    }
}
