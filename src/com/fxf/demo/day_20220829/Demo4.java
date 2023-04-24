package com.fxf.demo.day_20220829;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        for (int i = 1; i <= s.length() / 2; i++) {
            if (s.length() % i == 0){
                int flag = 1;
                String tmep = s.substring(0,i);
//                int end = i + i;
                for (int j = i + i; j <= s.length(); j += i) {
                    if (!s.substring(j - i,j).equals(tmep)){
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1){
                    System.out.println(tmep);
                    return;
                }

            }
        }
    }
}
