package com.fxf.demo9.day20220905;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.length() - i < result){
                break;
            }
            for (int j = i + 1; j < s.length(); j++) {
                String temp = s.substring(i,j + 1);
                if (palindrome(temp)){
                    if (result < temp.length()){
                        result = temp.length();
                    }
                }
            }
        }
        System.out.println(result);

    }
    public static boolean palindrome(String s){
        if (s.length() == 1){
            return true;
        }else if (s.length() == 2){
            if (s.charAt(0) == s.charAt(1)){
                return true;
            }else
                return false;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            if (s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else
                return false;
        }
        return true;
    }
}
