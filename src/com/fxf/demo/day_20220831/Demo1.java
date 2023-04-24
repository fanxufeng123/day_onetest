package com.fxf.demo.day_20220831;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i)) + 1);
            }else {
                map.put(str.charAt(i),1);
            }
        }
        int min = Integer.MAX_VALUE;
        HashMap<Character,Character> hashMap = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() < min){
                min = entry.getValue();
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == min){
                min = entry.getValue();
                hashMap.put(entry.getKey(),entry.getKey());
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!hashMap.containsKey(str.charAt(i)))
                sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());

    }
}
