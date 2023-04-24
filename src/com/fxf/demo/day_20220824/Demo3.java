package com.fxf.demo.day_20220824;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Demo3 {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0){
            return 0;
        }
        int reuslt = 0;
        int left = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                left = Math.max(map.get(s.charAt(i)) + 1,left);
            }
            map.put(s.charAt(i),i);
            reuslt = Math.max(reuslt,i - left + 1);

        }
        return reuslt;
    }

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(lengthOfLongestSubstring(s));
//        ArrayList
//        ConcurrentHashMap
    }
}
