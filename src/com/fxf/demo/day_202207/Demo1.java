package com.fxf.demo.day_202207;

import org.junit.Test;

import java.util.Arrays;

public class Demo1 {

    final static int a = 1;
    static final int b = 2;

    public static void main(String[] args) {
        int[] g = new int[]{1, 2, 3};
        int[] s = new int[]{1, 1};
        int contentChildren = findContentChildren(g, s);
        System.out.println("111");

    }

    public static int findContentChildren(int[] g, int[] s) {
        if (s.length == 0) {
            return 0;
        }
        int result = 0;
        int flag = 0;
        Arrays.sort(s);
        Arrays.sort(g);
        for (int i = 0; i < s.length; i++) {
            int temp = s[i];
            for (int j = flag; j < g.length; j++) {
                if (temp >= g[j]) {
                    result++;
                    flag = j + 1;
                    break;
                }
            }
        }
        return result;
    }

    @Test
    public static void demo(){
        final int a = 1;
    }
}

