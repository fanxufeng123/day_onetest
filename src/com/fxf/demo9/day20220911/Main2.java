package com.fxf.demo9.day20220911;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> result = new LinkedList<>();

        String front = "";    //记录前缀
        String frontfront = "";    //记录前缀
        int flag = 0;          //记录上一个开头的出现位置；
        String str = scanner.nextLine();
        while (!str.equals("#")){
            String[] split = str.split(":");
            if (split[0].charAt(0) != ' '){
                front = split[0];
                result.add(str);
                str = scanner.nextLine();
                continue;
            }
            int temp = 0;
            for (int i = 0; i < split[0].length(); i++) {
                if (split[0].charAt(i) != ' '){
                    temp = i;
                    break;
                }

            }
            if (flag == temp){
                String a = split[0].substring(temp,split[0].length());
                String s = frontfront + "-" + a + ":" + split[1];
                result.add(s);
            }else {
                flag = temp;
                String a = split[0].substring(temp,split[0].length());
                String s = front + "-" + a + ":" + split[1];
                result.add(s);
                frontfront = front;
                front = front + "-" + a;
            }

            str = scanner.nextLine();
        }
        result.add(str);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
