package com.fxf.demo9.day20220902;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();
        long ac = a % c, bc = b % c;
        long cab = c - ac, cbc = c - bc;
        if (c > ac + bc){
            System.out.println(0);
            return;
        }
        long result = Math.min(Math.min(ac, c - ac), Math.min(bc,c - bc)) * 2;
        System.out.println(result);
    }
}
