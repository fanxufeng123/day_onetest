package com.fxf.demo.day_20220806;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo6 {
    public static void main(String[] args) {
        String string = "Nice   to meet to you";
        System.out.println(findEwordCount(string));

    }
    public static int findEwordCount (String string) {
        int flag = 0;
        int result = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ' && i != 0){
                flag = 0;
            }
            if ((string.charAt(i) == 'e' || string.charAt(i) == 'E') && flag == 0){
                result++;
                flag = 1;
                continue;
            }

        }
        return result;
    }
}
