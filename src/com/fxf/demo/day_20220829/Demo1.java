package com.fxf.demo.day_20220829;

import java.util.Scanner;

public class Demo1 {
    static int front,end;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(";");

        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > 3){
                continue;
            }
            if (str[i].length() == 3){
                if (str[i].charAt(1) >= '1' && str[i].charAt(1) <= '9' && str[i].charAt(2) >= '0' && str[i].charAt(2) <= '9'){
                    int number = Integer.valueOf(str[i].substring(1,3));
                    fangXiang(str[i].charAt(0),number);
                }
            }else if (str[i].length() == 2){
                if (str[i].charAt(1) >= '0' && str[i].charAt(1) <= '9'){
                    int number = Integer.valueOf(str[i].substring(1,2));
                    fangXiang(str[i].charAt(0),number);
                }
            }

        }
        System.out.println(front + "," + end);
    }

    public static void fangXiang(char a, int number){
        if (a == 'W')
            end += number;
        else if (a == 'S')
            end -= number;
        else if (a == 'A')
            front -= number;
        else if (a == 'D')
            front += number;
    }
}
