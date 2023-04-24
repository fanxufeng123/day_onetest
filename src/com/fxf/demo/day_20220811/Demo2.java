package com.fxf.demo.day_20220811;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class Demo2 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,2,1};
        int[] nums2 = new int[]{3,2,1,4,7};
        System.out.println(findLength(nums1,nums2));
    }

    public static int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        int result = 0;

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(nums1[i - 1] == nums2[j - 1]){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                if (dp[i][j] > result){
                    result = dp[i][j];
                }
            }
        }

        return result;
    }
}
