package com.fxf.demo9.day20220919;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String str = String.valueOf(i);
            map.put(str,str);
        }
        System.out.println();
    }
}
