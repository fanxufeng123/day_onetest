package com.fxf.demo9.day20220911;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(",");
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < str.length; i++) {
            int temp = Integer.parseInt(str[i]);
            set.add(temp);
        }
        Integer[] integers = set.toArray(new Integer[set.size()]);
        int[] nums = new int[integers.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = integers[i];
        }
        Arrays.sort(nums);
        System.out.println(nums[nums.length - 1] * nums[nums.length - 2]);

    }
}
