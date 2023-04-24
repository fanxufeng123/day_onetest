package com.fxf.demo.day_20220830;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int[][] nums = new int[][]{{1,1},{2,2},{2,3},{0,2},{1,4},{0,1},{1,5},{0,1}};
        int[][] nums = new int[][]{{1,100},{2,100000},{2,123},{1,101},{0,123},{1,10},{2,115},{0,100},{2,110},{0,115}};

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        List<Integer> flag = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i][0] == 0){
                int temp1 = 0,temp2 = 0;
                int count = 0;
                for (Integer temp : arrayDeque) {
                    if (temp == nums[i][1]){
                        temp1 = count;
                        temp2 = arrayDeque.size() - temp1 - 1;
                    }else {
                        count++;
                    }
                }
                int min = temp1 > temp2 ? temp2 : temp1;
                flag.add(min);
            }else if (nums[i][0] == 1){
                arrayDeque.addFirst(nums[i][1]);
            }else if (nums[i][0] == 2){
                arrayDeque.addLast(nums[i][1]);
            }
        }
        for (int i = 0; i < flag.size(); i++) {
            System.out.println(flag.get(i));
        }



    }
}
