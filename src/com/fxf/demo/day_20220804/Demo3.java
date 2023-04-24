package com.fxf.demo.day_20220804;

import java.util.HashMap;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.valueOf(input.nextLine());
        String s = input.nextLine();

        int[] result = new int[4];

        int temp0 = 0;
        int temp1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'r'){
                temp0++;
            }
            if (s.charAt(i) == 'b'){
                temp1++;
            }
        }
        result[0] = temp0;
        result[1] = temp1;
        //前红后蓝







    }

}
