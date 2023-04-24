package com.fxf.demo9.day20220928;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        String s = new String("abc");
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s == s1.intern());
        System.out.println(s == s2.intern());
        System.out.println(s1 == s2.intern());
    }
}
