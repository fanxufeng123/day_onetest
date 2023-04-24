package com.fxf.demo9.day20220921;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<? super B> list = new ArrayList<>();
//        list.add(new A());
//        list.add(new B());
//        list.add(new C());
//        f1(list);
//        f2(list);
//        f3(list);
    }

    private static void f1(List< ? super A> list){}
    private static void f2(List< ? super B> list){}
    private static void f3(List< ? super C> list){}
    public static class A{}
    public static class B{}
    public static class C{}
}
