package com.fxf.demo9.day20220925;

class People{
    String name;
    public People(){
        System.out.println(1);
    }
    public People(String name){
        System.out.println(2);
        this.name = name;
    }
}
public class Child extends People{
    People father;
    public Child(String name){
        System.out.println(3);
        this.name = name;
        father = new People(name + ":F");
    }
    public Child(){
        System.out.println(4);
    }

    public static void main(String[] args) {
        final int MAX_VALUE = 1000;
        new Child("mike");
    }
}
