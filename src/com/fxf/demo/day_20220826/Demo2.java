package com.fxf.demo.day_20220826;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] s = input.nextLine().split(" ");
        System.out.println(s[s.length - 1].length());
    }
}
