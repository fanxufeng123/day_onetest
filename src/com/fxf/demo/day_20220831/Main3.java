package com.fxf.demo.day_20220831;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numsFront = new int[n];
        int[] numsEnd = new int[n];
        boolean[] flag = new boolean[n + 1];
        for (boolean temp :
                flag) {
            temp = false;
        }
        for (int i = 0; i < n; i++) {
            numsFront[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            numsEnd[i] = input.nextInt();
        }

        int cout = 0;
        int i = 0;
        int j = 0;
        for (;i < numsEnd.length;) {
            if (!flag[numsFront[j]]){
                flag[numsEnd[i]] = true;
                if (numsEnd[i] != numsFront[j]){
                    cout++;
                    i++;
                }else {
                    j++;
                    i++;
                }
            }else
                j++;

        }
        System.out.println(cout);
    }
}
