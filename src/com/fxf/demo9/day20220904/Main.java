package com.fxf.demo9.day20220904;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long[] nums = new long[n];
        double numscount = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextLong();
            numscount += nums[i];
        }
        double ave = numscount / (double) n;
        Arrays.sort(nums);
        int reuslt = n;
        for (int i = n - 1; i >= 0; i--) {
             if (ave * k < nums[i]){
                 ave = (ave * reuslt - nums[i]) / (reuslt - 1);
                 reuslt -= 1;
                 continue;
             }
            System.out.println(reuslt);
            break;
        }


    }
}
