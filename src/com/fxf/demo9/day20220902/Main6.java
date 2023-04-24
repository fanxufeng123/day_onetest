package com.fxf.demo9.day20220902;

import java.util.Scanner;

public class Main6 {
    static long[][] resultFlag;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        long[][] nums = new long[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                nums[i][j] = gNum(i + 1,j + 1);
        resultFlag = new long[n + 1][m + 1];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                resultFlag[i + 1][j + 1] = resultFlag[i][j + 1] - resultFlag[i][j] + nums[i][j] + resultFlag[i + 1][j];
        long sum = 0;
        for (int i = 0; i + k - 1 < n; i++) {
            for (int j = 0; j + k - 1 < m; j++) {
                sum += sumRegion(i , j, i + k - 1, j + k - 1);
            }
        }
        System.out.println(sum);
    }
    public static long sumRegion(int row1, int col1, int row2, int col2){
        return resultFlag[row2 + 1][col2 + 1] - resultFlag[row1][col2 + 1] + resultFlag[row1][col1] - resultFlag[row2 + 1][col1];
    }
    public static long gNum(int a, int b){
        if (b == 0){
            return a;
        }else {
            return gNum(b, a % b);
        }
    }

}
