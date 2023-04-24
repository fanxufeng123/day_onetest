package com.fxf.demo.day_20220826;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        Integer[] integers = list.toArray(new Integer[list.size()]);
        Arrays.sort(integers);
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }


    }
}
