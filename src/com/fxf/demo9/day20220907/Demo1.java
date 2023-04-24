package com.fxf.demo9.day20220907;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double distance = 0;
        double height = n;
        int flag = 0;
        while (flag < 5){
            if (flag == 0){
                distance += height;
            }else {
                distance += height * 2;
            }
            height /= 2;
            flag++;
        }
        System.out.println(distance);
        System.out.println(height);
    }
}
