package com.fxf.demo9.day20220902;

import java.util.Arrays;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jiNeng = input.nextInt();
        int duiNeng = input.nextInt();
        Long jiNengNumber[] = new Long[jiNeng];
        Long duiNengNumber[] = new Long[jiNeng];
        for (int i = 0; i < jiNeng; i++)
            jiNengNumber[i] = input.nextLong();
        for (int i = 0; i < jiNeng; i++)
            duiNengNumber[i] = input.nextLong();
        Arrays.sort(jiNengNumber,(t1,t2) ->
                (int)(t2 - t1));
        Arrays.sort(duiNengNumber);
        for (int i = 0; i < duiNeng; i++) {
            long a = input.nextLong();
            long b = input.nextLong();
            System.out.println(getMax(jiNengNumber,duiNengNumber,a,b));
        }
    }
    public static long getMax(Long[] me, Long[] y, long a, long b){
        long result = 0;
        long mSum = 0;
        long ySum = 0;
        for (int i = 0; i < me.length; i++) {
            mSum += me[i] * a;
            ySum += y[i] * b;
            if (me[i] * a <= y[i] * b)
                break;
            result = Math.max(result,mSum - ySum);
        }
        return result;
    }
}
