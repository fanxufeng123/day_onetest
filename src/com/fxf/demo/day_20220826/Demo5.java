package com.fxf.demo.day_20220826;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        Map<Character,Integer> map = new HashMap<>();
        map.put('0',0);
        map.put('1',1);
        map.put('2',2);
        map.put('3',3);
        map.put('4',4);
        map.put('5',5);
        map.put('6',6);
        map.put('7',7);
        map.put('8',8);
        map.put('9',9);
        map.put('A',10);
        map.put('B',11);
        map.put('C',12);
        map.put('D',13);
        map.put('E',14);
        map.put('F',15);
        String str = scanner.nextLine();
        String substring = str.substring(2, str.length());
        int result = 0;
        int flag = 0;
        for (int i = substring.length() - 1; i >= 0; i--) {
            result += map.get(substring.charAt(i)) * (int)Math.pow(16,flag);
            flag++;
        }
        System.out.println(result);
    }
}
