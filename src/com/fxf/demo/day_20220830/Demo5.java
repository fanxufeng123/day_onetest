package com.fxf.demo.day_20220830;

import java.util.Map;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numNumber = new int[n];
        for (int i = 0; i < n; i++) {
            numNumber[i] = input.nextInt();
        }
        int[] numberChar = new int[n];
        for (int i = 1; i < n; i++) {
            int temp = Math.abs(numNumber[i] - numNumber[i - 1]);
            numberChar[i] = temp;
        }
        int maxNunber = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            numberChar[i] = Math.max(numberChar[i], Math.abs(numNumber[i] - numNumber[i + 1]));
            if (numberChar[maxNunber] < numberChar[i]){
                maxNunber = i;
            }else {
                maxNunber = maxNunber;
            }
        }
        int res = 0;
        if (maxNunber - 1 > 0 && maxNunber < n - 1)
            numNumber[maxNunber - 1] = (numNumber[maxNunber - 2] + numNumber[maxNunber]) / 2;
        else if (maxNunber - 1 == 0)
            numNumber[maxNunber - 1] = numNumber[maxNunber];
        else
            numNumber[maxNunber] = numNumber[maxNunber - 1];

        for (int i = 0; i < numNumber.length; i++) {
            if (i == 0)
                res = Math.max(res, Math.abs(numNumber[i] - numNumber[i + 1]));
            else if (i == numNumber.length - 1)
                res = Math.max(res, Math.abs(numNumber[i] - numNumber[i - 1]));
            else
                res = Math.max(res, Math.max(Math.abs(numNumber[i] - numNumber[i - 1]),Math.abs(numNumber[i] - numNumber[i + 1])));
        }
        System.out.println(res);
    }
}
