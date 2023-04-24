package com.fxf.demo9.day20221029;

import com.fxf.demo.aaaTestDemo.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(count(s));
    }
    public static int count (String s) {
        String[] str = s.split(" ");
        str[0] = str[0].substring(1,str[0].length());
        str[str.length - 1] = str[str.length - 1].substring(0,str[str.length - 1].length() - 1);
        int a = Aabcount(str);
        return a;
    }
    public static int Aabcount(String[] str){
        String[] flag = new String[3];
        int result = 0;
        if (str.length < 3){
            return 0;
        }
        for (int i = 0; i < 3; i++) {
            flag[i] = str[i];
        }
        if (Panduan(flag)){
            result++;
        }
        for (int i = 3; i < str.length; i++) {
            flag[0] = flag[1];
            flag[1] = flag[2];
            flag[2] = str[i];
            if (Panduan(flag)){
                result++;
            }
        }
        return result;
    }
    public static boolean Panduan(String[] str){
        String A = str[0];
        String B = str[1];
        String C = str[2];
        if (A.equals(B) && !B.equals(C)){
            return true;
        }
        return false;
    }
}
