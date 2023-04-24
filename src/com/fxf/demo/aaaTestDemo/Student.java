package com.fxf.demo.aaaTestDemo;

public class Student extends Person{
    int age;
    String name;


    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void eat(){
        System.out.println(name);;
        System.out.println(age);
    }
}
