package com.fxf.demo.day_20220729;

public class Demo1 {
    public static void main(String[] args) {
        int n = 332;
        int i = monotoneIncreasingDigits(n);
        System.out.println(i);


    }

    public static int monotoneIncreasingDigits(int n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        int flag = -1;
        for (int i = sb.length() - 1; i > 0; i--) {
            if ((int)(sb.charAt(i)) < (int)(sb.charAt(i - 1))){
                flag = i;
                sb.setCharAt(i - 1, (char) ((int)(sb.charAt(i - 1)) - 1));
            }
        }
        if (flag == -1){
            return n;
        }
        for (int i = flag; i < sb.length(); i++) {
            sb.setCharAt(i, '9');
        }

        return Integer.valueOf(sb.toString());
    }
}
