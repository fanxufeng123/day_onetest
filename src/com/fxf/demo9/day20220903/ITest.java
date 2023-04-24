package com.fxf.demo9.day20220903;

interface ITest {
//    public static final String name;
    public int a = 1;
    public void print();
    public void getInfo();
}

abstract class Person implements ITest{
    @Override
    public void print() {

    }
}
