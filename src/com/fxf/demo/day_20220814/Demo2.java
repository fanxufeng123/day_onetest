package com.fxf.demo.day_20220814;

public class Demo2 {
    public static void main(String[] args) {
        String word1 = "sea";
        String word2 = "eat";
        System.out.println(minDistance(word1,word2));

    }
    public static int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i][j - 1]);
                }
            }
        }

        return word1.length() + word2.length() - 2 * dp[dp.length - 1][dp[0].length - 1];
    }
}
