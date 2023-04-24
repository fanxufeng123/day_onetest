package com.fxf.demo.day_20220808;

import java.util.List;

public class Demo3 {
    public static void main(String[] args) {


    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] result = new boolean[s.length() + 1];
        result[0] = true;
        for (int i = 1; i < result.length; i++) {
            for (int j = 0; j < i; j++) {
                if (wordDict.contains(s.substring(j,i)) && result[j]){
                    result[i] = true;
                }
            }
        }

        return result[result.length - 1];
    }
}
