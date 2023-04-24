package com.fxf.demo.day_20220823;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nums = scanner.nextLine();
        int k = scanner.nextInt();
        String[] sc = nums.split(",");
        int[] nums1 = new int[sc.length];
        for (int i = 0; i < sc.length; i++) {
            nums1[i] = Integer.valueOf(sc[i]);
        }
        System.out.println(canPartitionKSubsets(nums1,k));
        int a = 0;
//        (++a) += a;
    }

    private static boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        int maxNum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (maxNum < nums[i])
                maxNum = nums[i];
        }
        if (sum % k != 0 || maxNum > sum / k)
            return false;
        boolean[] used = new boolean[nums.length];
        return backtracking(nums, k, sum / k, 0, 0, used);
    }

    private static boolean backtracking(int[] nums, int k, int target, int cur, int start, boolean[] used) {
        if (k == 0)
            return true;
        if (cur == target){
            return backtracking(nums, k - 1, target, 0, 0, used);
        }
        for (int i = start; i < nums.length; i++) {
            if (!used[i] && cur + nums[i] <= target){
                used[i] = true;
                if (backtracking(nums,k,target,cur + nums[i], i + 1,used))
                    return true;
                used[i] = false;
            }
        }

        return false;
    }
}
