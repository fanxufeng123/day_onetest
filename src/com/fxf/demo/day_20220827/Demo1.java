package com.fxf.demo.day_20220827;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nums = new int[n][2];
        for (int i = 0; i < nums.length; i++) {
            nums[i][0] = scanner.nextInt();
            nums[i][1] = scanner.nextInt();
        }

        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (treeMap.containsKey(nums[i][0])){
                treeMap.put(nums[i][0],treeMap.get(nums[i][0]) + nums[i][1]);
            }else {
                treeMap.put(nums[i][0],nums[i][1]);
            }
        }
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            Integer mapKey = entry.getKey();
            Integer mapValue = entry.getValue();
            System.out.println(mapKey + " " + mapValue);
        }
    }
}
