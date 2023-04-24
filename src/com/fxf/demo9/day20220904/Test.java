package com.fxf.demo9.day20220904;

import java.util.*;

public class Test {
    public static void main(String[] args){

    }

    //n的单位是万元
    public static void test2(int n){
        if (n < 10){
            System.out.println(n * 0.05);
        }else if(n < 20){
            System.out.println(10 * 0.05 + (n - 10) * 0.04);
        }else if (n < 40){
            System.out.println(10 * 0.05 + 10 * 0.04 + (n - 20) * 0.05);
        }else if (n < 60){
            System.out.println(10 * 0.05 + 10 * 0.04 + 20 * 0.05 + (n - 40) * 0.03);
        }else if (n < 100){
            System.out.println(10 * 0.05 + 10 * 0.04 + 20 * 0.05 + 20 * 0.03 + (n - 60) * 0.015);
        }else{
            System.out.println(10 * 0.05 + 10 * 0.04 + 20 * 0.05 + 20 * 0.03 + 40 * 0.015 + (n - 100) * 0.01);
        }
    }



}
