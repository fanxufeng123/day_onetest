package com.fxf.demo9.day20220924;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long a = jie(2 * n);
        long b = jie(n);
        long c = jie(n + 1);
        System.out.println((jie(2 * n) % (jie(n) * jie(n + 1))) % 1000000007);
    }

    public static long jie(int n){
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = (result * i) % 1000000007;
        }
        return result;
    }
}
