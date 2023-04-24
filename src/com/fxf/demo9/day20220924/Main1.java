package com.fxf.demo9.day20220924;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int[] nums = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            if (i == 0){
                nums[i] = Integer.parseInt(s[i].substring(1,s[i].length() - 1));
            }else {
                nums[i] = Integer.parseInt(s[i].substring(0,s[i].length() - 1));
            }
        }

    }
}
