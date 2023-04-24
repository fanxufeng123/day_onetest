package com.fxf.demo9.day20220924;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(numSquares(n));
    }

    public static int numSquares(int n) {
        List<Integer> count = countNumber(n);
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < count.size(); i++) {
            for (int j = count.get(i); j < n + 1; j++) {
                if (dp[j - count.get(i)] != Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j - count.get(i)] + 1, dp[j]);
                }
            }
        }
        return dp[n];

    }

    public static List<Integer> countNumber(int n){
        List<Integer> result = new LinkedList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            result.add(i * i);
        }
        return result;
    }
}
