package com.fxf.demo9.day20220903;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Test {
    private int i = 1;
    private Object object = new Object();

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        System.out.println(list1.getClass().equals(list2.getClass()));

    }
    class MyThread extends Thread{
        public void run(){
            synchronized (object){
                i++;
                System.out.println(i);
                try {
                    sleep(1000);
                }catch (Exception e){

                }
                i += 2;
                System.out.println(i);
            }
        }
    }

}

