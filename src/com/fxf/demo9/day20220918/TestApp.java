package com.fxf.demo9.day20220918;

public class TestApp implements Runnable{
    public void run(){
        System.out.println("run...");
        throw new RuntimeException("Promblem happen...");
    }
}
