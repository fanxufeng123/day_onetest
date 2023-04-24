package com.fxf.demo.day_20220808;

import java.util.Arrays;
import java.util.LinkedList;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(numSquares(12));

    }

    public static int numSquares(int n) {
        int[] coins = number(n);
        int amount = n;

        int max = Integer.MAX_VALUE;
        int[] dp = new int[amount + 1];
        //初始化dp数组为最大值
        for (int j = 0; j < dp.length; j++) {
            dp[j] = max;
        }
        //当金额为0时需要的硬币数目为0
        dp[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i < dp.length; i++) {
                if (dp[i - coin] != max){
                    dp[i] = Math.min(dp[i - coin] + 1,dp[i]);
                }
            }
        }
        return dp[amount] == max ? -1 : dp[amount];
    }

    public static int[] number(int n){
        LinkedList<Integer> linkedList = new LinkedList();
        for (int i = 1; i <= n; i++) {
            if ((int)Math.sqrt(i) * (int)Math.sqrt(i) == i){
                linkedList.add(i);
            }
        }
        Integer[] integers = linkedList.toArray(new Integer[linkedList.size()]);
        return Arrays.stream(integers).mapToInt(Integer::valueOf).toArray();
    }
}
