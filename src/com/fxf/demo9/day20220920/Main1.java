package com.fxf.demo9.day20220920;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(minDistance(a, b));

    }
    public static int minDistance(String a, String b){
        int lena = a.length();
        int lenb = b.length();
        if (lena * lenb == 0){
            return lena + lenb;
        }
        int[][] dp = new int[lena + 1][lenb + 1];
        for (int i = 0; i < lena + 1; i++)
            dp[i][0] = i;
        for (int i = 0; i < lenb + 1; i++)
            dp[0][i] = i;
        for (int i = 1; i < lena + 1; i++) {
            for (int j = 1; j < lenb + 1; j++) {
                int temp = dp[i - 1][j] + 1;
                int end = dp[i][j - 1] + 1;
                int left_down = dp[i - 1][j - 1];
                if (a.charAt(i - 1) != b.charAt(j - 1)){
                    left_down += 1;
                }
                dp[i][j] = Math.min(temp,Math.min(end,left_down));
            }
        }
        return dp[lena][lenb];
    }
}
