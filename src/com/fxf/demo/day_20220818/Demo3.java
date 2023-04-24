package com.fxf.demo.day_20220818;

public class Demo3 {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{1,2,3}, {4,5,6}};
        int n = 2;
        int m = 3;
        int x = 6;
        int[] element = findElement(mat, n, m, x);
        System.out.println(element[0]);
        System.out.println(element[1]);

    }
    public static int[] findElement(int[][] mat, int n, int m, int x) {
        // write code here
        for (int i = 0; i < n; i++) {
            if(mat[i][m - 1] >= x){
                for (int j = 0; j < m; j++) {
                    if (mat[i][j] == x)
                        return new int[]{i,j};
                }
            }
        }
        return new int[2];
    }
}
