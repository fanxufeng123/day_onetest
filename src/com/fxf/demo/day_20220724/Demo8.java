package com.fxf.demo.day_20220724;

public class Demo8 {

    public static void main(String[] args) {

        int[] ratings = new int[]{1,0,2};
        int candy = candy(ratings);
        System.out.println(candy);

    }

    public static int candy(int[] ratings) {
        int [] candyVec = new int[ratings.length];
        candyVec[0] = 1;
        int result = 0;

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]){
                candyVec[i] = candyVec[i - 1] + 1;
            }else {
                candyVec[i] = 1;
            }
        }

        for (int i = ratings.length - 2; i >= 0 ; i--) {
            if (ratings[i] > ratings[i + 1]){
                candyVec[i] = Math.max(candyVec[i], candyVec[i + 1] + 1);
            }
        }

        for (int i = 0; i < candyVec.length; i++) {
            result += candyVec[i];
        }

        return result;
    }
}
