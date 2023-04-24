package com.fxf.demo.day_20220729;

public class Demo {

    public static void main(String[] args) {
        int[] prices = new int[]{1,3,2,8,4,9};
        int fee = 2;
        int i = maxProfit(prices, fee);
        System.out.println(i);

    }

    public static int maxProfit(int[] prices, int fee) {
        int result = 0;    //表示利润
        int buy = prices[0] + fee;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] + fee < buy){
                buy = prices[i] + fee;
            }else if (prices[i] > buy){
                result += prices[i] - buy;
                buy = prices[i];
            }
        }

        return result;
    }
}
