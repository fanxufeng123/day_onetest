package com.fxf.demo9.day20220919;

import java.util.LinkedList;
import java.util.Scanner;

public class Main4 {
//    static StringBuilder sb = new StringBuilder();
    static LinkedList<String> result = new LinkedList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split(",");
        int n = Integer.parseInt(split[0]);
        String str = split[1].substring(1,split[1].length() - 1);

        LinkedList<Integer> flag = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) == '$'){
                flag.add(i);
                continue;
            }
            if (str.charAt(i) == '$' && str.charAt(i - 1) != '$'){
                flag.add(i);
            }
        }
        flag.add(str.length());

        int front = 0;
        for (int i = 0; i < flag.size(); i++) {
             strsub(str, front, flag.get(i), n);
             front = flag.get(i);
        }
        System.out.print("[");
        for (int i = 0; i < result.size(); i++) {
            if (i == result.size() - 1){
                System.out.print("\"");
                System.out.print(result.get(i));
                System.out.print("\"");
                break;
            }
            System.out.print("\"");
            System.out.print(result.get(i));
            System.out.print("\"");
            System.out.print(",");
        }
        System.out.print("]");

    }

    public static void strsub(String str, int front, int end, int n){
        if (end - front <= n){
            result.add(str.substring(front,end));
            return;
        }
        if (end - front > n){
            int a = front;
            int b = front + n;
            while (b < end){
                result.add(str.substring(a,b));
                a = b;
                b = b + n;
            }
            result.add(str.substring(a,end));
        }
    }
}
