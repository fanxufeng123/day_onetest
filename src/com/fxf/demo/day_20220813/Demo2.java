package com.fxf.demo.day_20220813;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] s = input.nextLine().split(" ");
        int[] temp = new int[3];
        for (int i = 0; i < s.length; i++) {
            temp[i] = Integer.valueOf(s[i]);
        }
        int n = temp[0];
        int m = temp[1];
        int k = temp[2];
        String str = input.nextLine();

        int[][] dp = new int[n][m];
        dp[0][0] = 1;
        int count = 1;

        int hang = 0;
        int lie = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'W'){
                hang--;
                if (dp[hang][lie] == 0){
                    dp[hang][lie] = 1;
                    count++;
                }
            }else if (str.charAt(i) == 'A'){
                lie--;
                if (dp[hang][lie] == 0){
                    dp[hang][lie] = 1;
                    count++;
                }

            }else if (str.charAt(i) == 'S'){
                hang++;
                if (dp[hang][lie] == 0){
                    dp[hang][lie] = 1;
                    count++;
                }

            }else if(str.charAt(i) == 'D'){
                lie++;
                if (dp[hang][lie] == 0){
                    dp[hang][lie] = 1;
                    count++;
                }

            }
            if (count == n * m){
                System.out.println("Yes");
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("No");
        System.out.println(n * m - count);
    }
}
