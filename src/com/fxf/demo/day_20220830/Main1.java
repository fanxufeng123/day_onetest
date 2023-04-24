package com.fxf.demo.day_20220830;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int[] nums = new int[q];
        for (int i = 0; i < q; i++) {
            nums[i] = scanner.nextInt();
        }
        int[] result = new int[q];
        for (int i = 0; i < nums.length; i++) {
            String strNumber = String.valueOf(nums[i]);
            char[] strChar = new char[strNumber.length()];
            for (int j = 0; j < strChar.length; j++) {
                strChar[j] = strNumber.charAt(j);
            }
            int flag = 0;
            for (int j = strNumber.length() - 1; j >= 0; j--) {
                if ((int)(strChar[j] - '0') % 2 == 0){
                    flag = 1;
                    char temp = strChar[j];
                    strChar[j] = strChar[strChar.length - 1];
                    strChar[strChar.length - 1] = temp;
                    result[i] = Integer.valueOf(new String(strChar));
                    break;
                }
            }
            if (flag == 0){
                result[i] = -1;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}
