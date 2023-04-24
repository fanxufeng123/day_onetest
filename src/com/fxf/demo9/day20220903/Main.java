package com.fxf.demo9.day20220903;

import java.util.Scanner;

public class Main {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                continue;
            }else if (nums[i] == 2){
                count++;
            }else if (nums[i] == 3){
                count += 2;
            }
            else {
                jiSuanCount(nums[i]);
            }
        }
        System.out.println(count);
    }
    public static int[] numberFen(int a){
        for (int i = (int)Math.sqrt(a); i >= 1; i--) {
            if (a / i * i == a){
                if (i == 1){
                    break;
                }
                return new int[]{i, a / i};
            }
        }
        return new int[]{1,a - 1};
    }
    public static void jiSuanCount(int n){
        if (n == 1){
            return;
        }else if (n == 2){
            count++;
            return;
        }else if (n == 3){
            count += 2;
            return;
        }
        int[] ints = numberFen(n);
        count++;
        for (int i = 0; i < ints.length; i++) {
            jiSuanCount(ints[i]);
        }
    }
}
