package com.fxf.demo9.day20220905;

public class Test {
    private int i = 1;
    private Object object = new Object();

    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = new String(s1);
        String s3 = s2.intern();

        System.out.println(s1 == s2);
        System.out.println(" ");
        System.out.println(s1 == s3);
    }


}
