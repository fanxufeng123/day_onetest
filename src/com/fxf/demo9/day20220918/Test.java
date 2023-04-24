package com.fxf.demo9.day20220918;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.stream.Stream;


public class Test {
    static void test(){
        try {
            String x = null;
            System.out.println(x.toString() + " ");
        }finally {
            System.out.println("finally");
        }
    }
    public static void main(String[] args) {
        try {
            test();
        }catch (Exception ex){
            System.out.println("exception");
        }
    }
}
