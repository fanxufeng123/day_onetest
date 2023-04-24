package com.fxf.demo9.day20220927;

import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test(){
        int a = 1;
        try {
            return a;
        }catch (Exception e){
            return 2;
        }finally {
            return ++a;
        }
    }
}
