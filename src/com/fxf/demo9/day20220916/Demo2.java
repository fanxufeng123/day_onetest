package com.fxf.demo9.day20220916;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] windows = new int[m];
        int result = 0;
        int count = 0;
        int flag = 2;
        windows[0] = nums[0];
        windows[1] = nums[1];
        windows[2] = nums[2];
        while (flag < nums.length){
            while (windows[0] > 0 && windows[1] > 0 && windows[2] > 0){
                windows[0]--;
                windows[1]--;
                windows[2]--;
                count++;
            }
            if (flag + 1 < nums.length){
                flag++;
                windows[0] = windows[1];
                windows[1] = windows[2];
                windows[2] = nums[flag];
            }else {
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        System.out.println(result - count * 3);
    }
}
