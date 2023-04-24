package com.fxf.demo.day_20220812;

public class Demo4 {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));


    }

    public static boolean isSubsequence(String s, String t) {
        if (t.length() == 0 && s.length() != 0){
            return false;
        }
        int flag = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = flag; j < t.length(); j++) {
                 if (s.charAt(i) == t.charAt(j)){
                     flag = j + 1;
                     count++;
                     break;
                 }
                 if (j == t.length() - 1){
                     return false;
                 }
            }
        }

        if (count == s.length()){
            return true;
        }else {
            return false;
        }
    }
}
