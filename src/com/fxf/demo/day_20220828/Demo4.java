package com.fxf.demo.day_20220828;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        while (n / 2 != 0){
            int temp = n - (n / 2) * 2;
            sb.append(String.valueOf(temp));
            n = n / 2;
        }
        sb.append(String.valueOf(n));
        sb.reverse();

        int result = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '1'){
                result++;
            }
        }
        System.out.println(result);

    }
}
