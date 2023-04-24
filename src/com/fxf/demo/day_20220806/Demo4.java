package com.fxf.demo.day_20220806;

public class Demo4 {
    public static void main(String[] args) {
        String string = "wwwiflytekwwww";
        System.out.println(findEwordCount(string));
    }

    public static int findEwordCount (String str) {
//        String[] s = string.split(" ");
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(s[i]);
//        }

        String t = "iflytek";
        int s_lenth = str.length();
        int t_lenth = t.length();
        if (s_lenth < t_lenth){
            return 0;
        }
        int[][] dp = new int[s_lenth + 1][t_lenth + 1];
        for (int i = 0; i <= s_lenth; i++) {
            dp[i][t_lenth] = 1;
        }
        for (int i = s_lenth - 1; i >= 0; i--) {
            char sss = str.charAt(i);
            for (int j = t_lenth - 1; j >= 0; j--) {
                char ttt = t.charAt(j);
                if (sss == ttt){
                    dp[i][j] = dp[i + 1][j + 1] + dp[i + 1][j];
                }else {
                    dp[i][j] = dp[i + 1][j];
                }
            }

        }
        return dp[0][0];


    }
}
