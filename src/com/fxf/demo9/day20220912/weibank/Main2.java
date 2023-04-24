package com.fxf.demo9.day20220912.weibank;

import java.util.Scanner;

public class Main2 {
    private int flag = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int abc = 1010,count = 15,flag = 998244353;
        int [][][][] dp = new int[abc][count][count][count];
        dp[0][m + 1][m + 1][m + 1] = 1;
        for (int p = 1; p <= n; p++) {
            for (int q = 1; q <= m + 1; q++) {
                for (int y = 1; y <= m + 1; y++) {
                    for (int z = 1; z <= m + 1; z++) {
                        for (int x = 1; x <= q && x <= m; x++) {
                            dp[p][x][y][z] = (dp[p][x][y][z] + dp[p - 1][q][y][z]) & flag;
                        }
                        for (int x = q + 1; x <= y && x <= m ; x++) {
                            dp[p][q][x][z] = (dp[p][q][x][z] + dp[p - 1][q][y][z]) % flag;
                        }
                        for (int x = y + 1; x <= z && x <= m ; x++) {
                            dp[p][q][y][x] = (dp[p][q][y][x] + dp[p - 1][q][y][z]) % flag;
                        }
                    }
                }
            }
        }
        long result = 0;
        for (int i = 1; i < m + 1 ; i++) {
            for (int j = 1; j < m  + 1; j++) {
                for (int k = 1; k < m + 1; k++) {
                    result = (result + dp[n][i][j][k]) % flag;

                }
            }
        }
        System.out.println(result);
    }
}
