package com.fxf.demo.day_20220828;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.nextLine();
        }
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < str.length; i++) {
            if (treeMap.containsKey(str[i])){
                treeMap.put(str[i],treeMap.get(str[i]) + 1);
            }else {
                treeMap.put(str[i],1);
            }
        }
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()){
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.println(entry.getKey());
            }
        }
    }
}
