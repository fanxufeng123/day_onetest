package com.fxf.demo.day_20220817;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int result = 0;
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                boolean b = panDuan(s.substring(i, j + 1));
                if (b == true && j - i > 1){
                    if (result < j - i + 1){
                        result = j - i + 1;
                        temp1 = i;
                        temp2 = j;
                    }
                }
            }
        }
        if (temp1 == 0 && temp2 == 0){
            System.out.println("");
            return;
        }
        System.out.println(s.substring(temp1, temp2 + 1));
//        Exception


    }
    public static boolean panDuan(String s){
        for (int k = 0; k < s.length() / 2; k++) {
            if (s.charAt(k) != s.charAt(s.length() - 1 - k)){
                return false;
            }
        }
        return true;
    }
}
