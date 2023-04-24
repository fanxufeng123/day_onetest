package com.fxf.demo9.day20220924;

class Animal{
    public void move(){
        System.out.println("111");
    }
}

class Dog extends Animal{
    public void move(){
        System.out.println("222");
    }
    public void bark(){
        System.out.println("333");
    }
}
public class TestDog {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        a.move();
        b.move();
//        b.bark();
    }
}
