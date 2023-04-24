package com.fxf.demo.day_20220820;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums[i][0] = input.nextInt();
            nums[i][1] = input.nextInt();
        }
        int a = input.nextInt();
        int b = input.nextInt();

        Map<Integer,Integer> map = new HashMap<>();
        int key = 0,value = 0;
        for (int i = 0; i < n; i++) {
            key = nums[i][0];
            value = nums[i][1];
            map.put(key,value);
        }

        if (a == 1 || b == 1){
            System.out.println(1);
            return;
        }

        int front = a;
        List<Integer> list1 = new ArrayList<>();
        while (map.get(front) != 1){
            list1.add(front);
            front = map.get(front);
//            if (map.get(front) == null){
//                break;
//            }
        }
        if (map.get(front) != null){
            list1.add(front);
            list1.add(1);
        }
        Integer[] integers = list1.toArray(new Integer[list1.size()]);

        int front1 = b;
        List<Integer> list2 = new ArrayList<>();
        while (map.get(front1) != 1){
            list2.add(front1);
            front1 = map.get(front1);
//            if (map.get(front1) == null){
//                break;
//            }
        }
        if (map.get(front1) != null){
            list2.add(front1);
            list2.add(1);
        }
        Integer[] integers1 = list2.toArray(new Integer[list2.size()]);

        for (int i = 0; i < integers.length; i++) {
            int temp = integers[i];
            for (int j = 0; j < integers1.length; j++) {
                int temp1 = integers1[j];
                if (temp == temp1){
                    System.out.println(temp);
                    return;
                }
            }
        }
//        System.out.println(1);


    }
}
