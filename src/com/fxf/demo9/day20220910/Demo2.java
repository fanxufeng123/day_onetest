package com.fxf.demo9.day20220910;

import java.util.*;

public class Demo2 {
    static ArrayDeque<List<Integer>> arrayDeque = new ArrayDeque<>();
    static int flag = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] nums = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }
        itiorer(nums, n, m, 0, 0,0,0,0,0);
        while (!arrayDeque.isEmpty()){
            List<Integer> list = arrayDeque.removeFirst();
            System.out.println("(" + list.get(0) + "," + list.get(1) + ")");
        }

    }

    public static void itiorer(int[][] nums, int n, int m, int i, int j, int front, int end, int left, int right){
        if (flag == 1){
            return;
        }
        arrayDeque.addLast(new LinkedList<Integer>(){{add(i);add(j);}});
        if (i == n - 1 && j == m - 1){
            flag = 1;
            return;
        }
        if (i + 1 < n && nums[i + 1][j] != 1 && front != 1){      //向下
            itiorer(nums, n, m,i + 1, j,0,1,0,0);
        }
        if (i - 1 >= 0 && nums[i - 1][j] != 1 && end != 1){      //向上
            itiorer(nums, n, m,i - 1, j,1,0,0,0);
        }
        if (j + 1 < m && nums[i][j + 1] != 1 && left != 1){      //向右
            itiorer(nums, n, m,i, j + 1,0,0,0,1);
        }
        if (j -1 >= 0 && nums[i][j - 1] != 1 && right != 1){      //向左
            itiorer(nums, n, m,i, j - 1,0,0,1,0);
        }
        if (flag == 0){
            arrayDeque.removeLast();
            return;
        }
    }
}
