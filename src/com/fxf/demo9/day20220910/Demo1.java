package com.fxf.demo9.day20220910;

import java.util.HashMap;
import java.util.Scanner;

public class Demo1 {
    static HashMap<Integer,Integer> hashMap= new HashMap();
    static int temp = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] weight = new int[n];
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = scanner.nextInt();
        }
        int length = 0;
        for (int i = 0; i < n; i++) {
            count[i] = scanner.nextInt();
            length += count[i];
        }

        int[] nums = new int[length];
        int flag = 0;
        for (int i = 0; i < count.length; i++) {
            int number = count[i];
            while (number > 0){
                nums[flag] = weight[i];
                flag++;
                number--;
            }
        }
        iteration(nums,0,length);
        System.out.println(hashMap.size());


    }
    public static void iteration(int[] nums, int index, int length){
        if (!hashMap.containsKey(temp)){
            hashMap.put(temp,temp);
        }
        if (index >= length){
            return;
        }

        for (int i = index; i < length; i++) {
            if (i > index && nums[i] == nums[i - 1]){
                continue;
            }
            temp += nums[i];
            iteration(nums, i + 1, length);
            temp -= nums[i];
        }
    }
}
