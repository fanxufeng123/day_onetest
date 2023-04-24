package com.fxf.demo.aaaTestDemo;

import java.util.Arrays;
import java.util.Collections;

public class PersonTest {
    public static void main(String[] args) {
        Person []persons = new Person[]{
                new Person("张三",15),
                new Person("李四",25),
                new Person("王五",20)
        };
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
        System.out.println(persons[0].toString());
        System.out.println(persons[1].toString());
//        Collections.sort();
        System.out.println(persons[0].toString());
        System.out.println(persons[1].toString());
        System.out.println(persons[0].toString());
        System.out.println(persons[1].toString());
        System.out.println(persons[0].toString());
        System.out.println(persons[1].toString());
        System.out.println(persons[0].toString());
        System.out.println(persons[1].toString());

    }
}
