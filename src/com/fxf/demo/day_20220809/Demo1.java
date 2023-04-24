package com.fxf.demo.day_20220809;

import java.math.BigInteger;
import java.util.LinkedList;

public class Demo1 {
    static LinkedList<Integer> result = new LinkedList<>();
    static int temp = 0;

    public static void main(String[] args) {
        int[] nums = new int[]{0};
        System.out.println(rob(nums));

    }

    public static int rob(int[] nums) {
        int length = nums.length;
        huiShu(nums,0,length);

        int number = 0;
        for (int a :
                result) {
            if (a > number){
                number = a;
            }
        }
        return number;

    }

    public static void huiShu(int[] nums, int index, int length){
        if (index > length - 1){
            result.add(temp);
            return;
        }

        for (int i = index; i <= index + 1; i++) {
            if (i > length - 1){ return; }
            temp += nums[i];
            huiShu(nums,i + 2, length);
            temp -= nums[i];

        }

    }
}
