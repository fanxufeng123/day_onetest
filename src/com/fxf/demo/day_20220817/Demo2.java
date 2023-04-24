package com.fxf.demo.day_20220817;

public class Demo2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        System.out.println(gcd(a, b));

    }
    public static int gcd (int a, int b) {
        // write code here
        int max = b;
        int min = a;
        if (a > b){
            max = a;
            min = b;
        }
        if (min == max || max % min == 0){
            return  min;
        }
        int result = 0;
        for (int i = 1; i < min + 1; i++) {
            if (min % i == 0 && max % i == 0 && result < i)
                result = i;
        }

        return result;
    }
}
