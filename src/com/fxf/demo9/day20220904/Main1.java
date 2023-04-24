package com.fxf.demo9.day20220904;

import java.util.HashMap;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nums = new int[3][n];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }
        int min = 0;
        for (int i = 0; i < n; i++) {
            if (nums[0][i] < min){
                min = nums[0][i];
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (nums[1][i] > max){
                max = nums[1][i];
            }
        }
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = min; i <= max; i++) {
            int i1 = fenKai(i);
            hashMap.put(i,i1);
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int left = nums[0][i];
            int right = nums[1][i];
            int target = nums[2][i];
            int temp = yiHuo(left, right, target,hashMap);
            result[i] = temp;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int yiHuo(int left, int right, int target, HashMap<Integer,Integer> resultFlag){
        int result = 0;
        for (int i = left; i <= right; i++) {
            if (resultFlag.get(i) == target){
                result++;
            }
        }
        return result;
    }
    public static int fenKai(int a){
        int result = 0;
        while (a >= 10){
            int temp = a % 10;
            result ^= temp;
            a = a / 10;
        }
        result ^= a;
        return result;
    }

}
