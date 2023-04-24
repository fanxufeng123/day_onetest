package com.fxf.demo9.day20220905;

import java.util.Stack;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int left = 0;
        int right = left + k - 1;
        int[] result = new int[n - k / 2 - 1];
        int flag = 0;
        if(k % 2 == 0){
            while(left <= n - k){
                int[] temp = clonenums(left, right, nums);
                int ave = (temp[k / 2] + temp[k / 2 - 1]) / 2 + 1;
                int a = ave - temp[0];
                int b = temp[k - 1] - ave;
                if(a == b){
                    result[flag] = temp[k - 1];
                }else{
                    result[flag] = a > b ? temp[0] : temp[k - 1];
                }
                flag++;
                left++;
                right++;
            }
        }else{
            while(left <= n - k){
                int[] temp = clonenums(left, right, nums);
                int ave = (temp[k / 2]);
                int a = ave - temp[0];
                int b = temp[k - 1] - ave;
                if(a == b){
                    result[flag] = temp[k - 1];
                }else{
                    result[flag] = a > b ? temp[0] : temp[k - 1];
                }
                flag++;
                left++;
                right++;
            }
        }
        System.out.print("[");
        for(int i = 0; i < result.length; i++){
            if(i == result.length - 1){
                System.out.print(result[i]);
                continue;
            }
            System.out.print(result[i] + ",");
        }
        System.out.print("]");
    }
    public static int[] clonenums(int left, int right, int[] nums){
        int[] result = new int[right - left + 1];
        int flag = 0;
        for(int i = left; i <= right; i++){
            result[flag] = nums[i];
            flag++;
        }
        Arrays.sort(result);
        return result;
    }
}