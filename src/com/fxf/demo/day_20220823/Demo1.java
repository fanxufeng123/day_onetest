package com.fxf.demo.day_20220823;

import java.util.HashMap;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        int num = convertCount(str1,str2);
        System.out.println(num);
    }

    private static int convertCount(String str1, String str2) {
        HashMap<Character,Character> hashMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)){
                char key = str1.charAt(i);
                char val = str2.charAt(i);
                if (hashMap.containsKey(key)){
                    if (hashMap.get(key) != val){
                        return -1;
                    }
                }else {
                    hashMap.put(key,val);
                    count++;
                }
            }
        }
        return count;
    }
}
