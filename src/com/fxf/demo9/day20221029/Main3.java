package com.fxf.demo9.day20221029;

public class Main3 {
    String str = new String("good");
    char[] ch = {'a','b','c'};
    public static void main(String[] args) {
        Main3 ex = new Main3();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str + "end");
        System.out.println(ex.ch);


    }
    public void change(String str, char ch[]){
        str = "test ok";
        ch[0] = 'g';
    }

    
}
