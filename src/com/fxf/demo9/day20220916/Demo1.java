package com.fxf.demo9.day20220916;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.nextLine();
        }
        int[] result = new int[n];
        for (int i = 0; i < str.length; i++) {
            result[i] = countChar(str[i]);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    public static int countChar(String str){
        int[] nums = new int[26];
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            nums[str.charAt(i) - 'a']++;
        }
        Arrays.sort(nums);
        int flag = 26;
        for (int i = nums.length - 1; i >= 0; i--) {
            result += nums[i] * flag;
            flag--;
        }
        return result;
    }

}
