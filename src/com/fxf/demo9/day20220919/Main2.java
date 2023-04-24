package com.fxf.demo9.day20220919;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> result = new LinkedList<>();
        for (int i = 1; i < 1000; i++) {
            if (isFive(i)){
                result.add(i);
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    public static boolean isFive(int n){
        char[] chars = String.valueOf(n).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '5'){
                return false;
            }
        }
        return true;
    }
}
