package com.fxf.demo.day_20220830;

public class ExTest {
    static  void test() throws RuntimeException{
        try{
            System.out.println("test");
            throw new RuntimeException();
        }catch (Exception ex){
            System.out.println("exception");
        }
    }
}
