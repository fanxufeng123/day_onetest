package com.fxf.demo.day_20220724;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Demo6 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,2,6,7,9};
        int k = 1;
        int i = largestSumAfterKNegations(nums,k );
        System.out.println(i);
    }
    public static int largestSumAfterKNegations(int[] nums, int k) {
        int result = 0;
        nums = IntStream.of(nums)
                .boxed()
                .sorted((o1, o2) -> Math.abs(o2) - Math.abs(o1))
                .mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && k > 0 ){
                nums[i] = -nums[i];
                k--;
            }
        }
        if (k > 0 && k % 2 == 1){
            nums[nums.length - 1] = -nums[nums.length - 1];
        }
        return Arrays.stream(nums).sum();
    }
}
