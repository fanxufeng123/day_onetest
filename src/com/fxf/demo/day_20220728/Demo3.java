package com.fxf.demo.day_20220728;

import java.util.LinkedList;
import java.util.List;

public class Demo3 {

    public static void main(String[] args) {

        String s = "ababcbacadefegdehijhklij";
        List<Integer> integers = partitionLabels(s);
        System.out.println("   ");

    }

    public static List<Integer> partitionLabels(String s) {
        LinkedList<Integer> result = new LinkedList<>();
        int flag = 0;
        int count = 0;
        for (int i = 0; i <= flag; i++) {
            if (flag == s.length()){
                break;
            }
            int lastIndex = foundLastIndex(i, s);
            if (lastIndex > flag){
                flag = lastIndex;
            }
            count++;
            if (i == flag){
                result.add(count);
                count = 0;
                flag++;
            }
        }
        return result;
    }

    //寻找最后一个字符
    public static int foundLastIndex(int index, String s){
        for (int i = s.length() - 1; i > index; i--) {
            if (s.charAt(i) == s.charAt(index)){
                return i;
            }
        }
        return -1;
    }
}
