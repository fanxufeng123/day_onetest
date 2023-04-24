package com.fxf.demo.day_20220724;

public class Demo3 {
    public static void main(String[] args) {
        int[] nums = new int[]{7,6,4,3,1};
        int i = maxProfit(nums);
        System.out.println(i);
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 1){
            return 0;
        }
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0){
                result += prices[i] - prices[i - 1];
            }
        }
        return result;
    }
}
