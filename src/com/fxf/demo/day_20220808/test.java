package com.fxf.demo.day_20220808;

import java.util.Collections;
import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        Integer a = new Integer(12);
        System.out.println();
        StringBuilder sb = new StringBuilder();
        StringBuffer sb1 = new StringBuffer();

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("12");
        linkedList.add("13");
        linkedList.add("15");
        linkedList.add("2");
        linkedList.add("1");
        Collections.sort(linkedList);
        System.out.println();
    }
}
