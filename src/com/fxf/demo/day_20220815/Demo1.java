package com.fxf.demo.day_20220815;

public class Demo1 {
    public static void main(String[] args) {

    }

    public static int longestPalindromeSubseq(String s) {
        int legnth = s.length();
        boolean[][] dp = new boolean[legnth][legnth];
        for (int j = 0; j < legnth; j++) {
            for (int i = 0; i < j + 1; i++) {
                if (s.charAt(j) == s.charAt(i)){
                    if (j - i >= 3){
                        dp[i][j] = dp[i + 1][j - 1];
                    }else {
                        dp[i][j] = true;
                    }
                }else {
                    dp[i][j] = false;
                }
            }
        }

        int reuslt = 0;
        for (int i = 0; i < legnth; i++) {
            for (int j = 0; j < legnth; j++) {
                if (dp[i][j])
                    reuslt++;
            }
        }

        return reuslt;
    }
}
