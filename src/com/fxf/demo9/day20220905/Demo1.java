package com.fxf.demo9.day20220905;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        List<String> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')){
                sb.append(str.charAt(i));
            }else {
                list.add(sb.toString());
                sb.delete(0,sb.length());
            }
        }
        list.add(sb.toString());
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == ""){
                continue;
            }else {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}
