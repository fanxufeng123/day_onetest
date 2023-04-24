package com.fxf.demo.day_20220813;

import java.util.Scanner;

public class Demo5 {
    static int result = 0;
    static int temp = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        huiSuo(nums,0,n);
        System.out.println(result);


    }
    public static void huiSuo(int[] nums,int index, int length){
        temp += nums[index];
        if (result < temp){
            result = temp;
        }
        if ((index + 1) * 2 > length){
            return;
        }

        huiSuo(nums,(index + 1) * 2 - 1,length);
        temp -= nums[(index + 1) * 2 - 1];
        huiSuo(nums,(index + 1) * 2,length);
        temp -= nums[(index + 1) * 2];

    }
}
