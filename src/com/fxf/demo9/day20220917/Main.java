package com.fxf.demo9.day20220917;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<Character,Integer> flag = new HashMap<>();
    static {
        flag.put('a',0);
        flag.put('e',0);
        flag.put('o',0);
        flag.put('i',0);
        flag.put('u',0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        String[] str = new String[t];
        String[] result = new String[t];
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.nextLine();
            result[i] = redString(str[i]);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
    public static String redString(String str){
        if (str.length() != 3){
            return "No";
        }else {
            if (flag.containsKey(str.charAt(1)) && !flag.containsKey(str.charAt(0))
                    && !flag.containsKey(str.charAt(2))){
                return "Yes";
            }
        }
        return "No";
    }
}
