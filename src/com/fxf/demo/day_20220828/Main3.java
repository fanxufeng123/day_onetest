package com.fxf.demo.day_20220828;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 6){
            System.out.println(2);
        }
        else if (n < 13){
            System.out.println(3);
        }
        else{
            System.out.println(1);
        }
    }
}
