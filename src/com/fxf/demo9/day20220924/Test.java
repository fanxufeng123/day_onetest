package com.fxf.demo9.day20220924;

public class Test {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("A");
        StringBuilder b = new StringBuilder("B");
        operator(a,b);
        System.out.println(a + "" + b);
    }
    public static void operator(StringBuilder x, StringBuilder y){
        x.append(y);
        y = x;
        System.out.println();
    }
}
