package com.fxf.demo9.day20220909;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        int result = 0;
        for (int i = 1; i < chars.length - 1; i++) {
            if (chars[i] == chars[i - 1]){
                result++;
            }else if (chars[i] == chars[i + 1]){
                result++;
                i++;
            }
        }
        System.out.println(result);
    }
}
