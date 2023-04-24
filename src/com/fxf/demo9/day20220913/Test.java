package com.fxf.demo9.day20220913;

public class Test{
    String str = new String("good");
    char[] ch = {'a','b','c'};
    public static void main(String[] args) {
        Test ex = new Test();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str);
        System.out.println(ex.ch);
    }
    public void change(String str, char ch[]){
        str = "test ok";
        ch[0] = 'g';
    }

}
