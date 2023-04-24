package com.fxf.demo9.day20220906;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        TreeMap<Character,Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (treeMap.containsKey(str.charAt(i))){
                treeMap.put(str.charAt(i),treeMap.get(str.charAt(i)) + 1);
            }else {
                treeMap.put(str.charAt(i), 1);
            }
        }
        List<Character> list = new LinkedList<>();
        for (Map.Entry<Character, Integer> it :
                treeMap.entrySet()) {
            while (it.getValue() != 0){
                list.add(it.getKey());
                it.setValue(it.getValue() - 1);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
