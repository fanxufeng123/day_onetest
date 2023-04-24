package com.fxf.demo9.day20220924;

public class Super {
    protected String member = "super member";
    static {
        System.out.println("super static");
    }
    public Super(){
        System.out.println("super constructor");
        System.out.println(member);
    }
    public static class Child extends Super{
        protected String member = "child member";
        protected static String staticMember = "static child member";
        static {
            System.out.println("child static");
        }
        public Child(){
            System.out.println("child constructor");
            System.out.println(member);
        }
    }

    public static void main(String[] args) {
        System.out.println(Child.staticMember);
        new Child();
    }
}
