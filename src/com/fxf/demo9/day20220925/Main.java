package com.fxf.demo9.day20220925;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> result = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            String target = scanner.nextLine();
            result.add(charString(str, target));
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    public static String charString(String str, String target){
        char[] chars = str.toCharArray();
        char[] targetNums = target.toCharArray();
        int flag = 0;
        for (int i = 0; i < targetNums.length; i++) {
            char temp = targetNums[i];
            for (int j = flag; j < chars.length; j++) {
                if (chars[j] == temp){
                    flag = j;
                    break;
                }
                if (j == chars.length - 1){
                    return "no";
                }
            }
        }
        return "yes";
    }
}
