package com.fxf.demo.day_20220820;

import java.util.*;

public class Demo5 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int[] nums = new int[n];
//        int[] temp = new int[n];
//        for (int i = 0; i < n; i++) {
//            nums[i] = input.nextInt();
//            temp[i] = nums[i];
//        }
//        Arrays.sort(temp);
//        int result1 = 0,result2 = 0;
//        result1 = temp[n - 1];
//        for (int i = n - 1; i >= 0; i--) {
//            if (result1 != temp[i]){
//                result2 = temp[i];
//                break;
//            }
//        }
//        int flag = 0;
//
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0){
//                if (result1 < nums[i]){
//                    count = -1;
//                    break;
//                }
//                count += result1 - nums[i];
//            }else {
//                if (result2 < nums[i]){
//                    count = -1;
//                    break;
//                }
//                count += result2 - nums[i];
//            }
//        }
//
//        int count1 = 0;
//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0){
//                if (result2 < nums[i]){
//                    count1 = -1;
//                    break;
//                }
//                count1 += result2 - nums[i];
//            }else {
//                if (result1 < nums[i]){
//                    count1 = -1;
//                    break;
//                }
//                count1 += result1 - nums[i];
//            }
//        }
//
//        int count2 = 0;
//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0){
//                count2 += result1 - nums[i];
//            }else {
//                count2 += result1 - nums[i] + 1;
//            }
//        }
//
//        int count3 = 0;
//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0){
//                count3 += result1 - nums[i] + 1;
//            }else {
//                count3 += result1 - nums[i];
//            }
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//        if (count >= 0){
//            list.add(count);
//        }
//        if (count1 >= 0){
//            list.add(count1);
//        }
//        if (count2 >= 0){
//            list.add(count2);
//        }
//        if (count3 >= 0){
//            list.add(count3);
//        }
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < list.size(); i++) {
//            if (min > list.get(i)){
//                min = list.get(i);
//            }
//        }
//        System.out.println(min);
//
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        int left = 0,right = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
            if (i % 2 == 0)
                left = nums[i] > left ? nums[i] : left;
            else if (i % 2 == 1)
                right = nums[i] > right ? nums[i] : right;
        }
        if (n < 3){
            System.out.println(0);
            return;
        }
        long count = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                count += left - nums[i];
            else if (i % 2 == 1)
                count += right - nums[i];

        }
        if (left == right)
            count += n / 2;
        System.out.println(count);

    }
}
