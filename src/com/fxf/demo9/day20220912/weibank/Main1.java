package com.fxf.demo9.day20220912.weibank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] nums = new String[n];
        for (int i = 0; i < n; i++) {
            nums[i] = String.valueOf(input.nextInt());
        }
        Arrays.sort(nums, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i = 0;
                while (i < o1.length() && i < o2.length() && o1.charAt(i) == o2.charAt(i)){
                    i++;
                }
                if (i == o1.length() || i == o2.length())
                    return o2.length() - o1.length();
                else {
                    return o2.length() == o1.length() ? o2.charAt(i) - o1.charAt(i) : o2.length() - o1.length();

                }
            }
        });
        String[] result = {nums[0],nums[1],nums[2]};
        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < 3; i++)
            System.out.println(result[i]);
    }
}
