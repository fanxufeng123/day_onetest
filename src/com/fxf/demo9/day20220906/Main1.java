package com.fxf.demo9.day20220906;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(countNumber1(10));
        int a = 1;
        System.out.printf("%d", a);
    }
    public static  int countNumber1(int i){
        int count = 0;
        while (i != 0){
            if(i % 2 == 1){
                count++;
            }
            i = i / 2;
        }
        return count;
    }
}
