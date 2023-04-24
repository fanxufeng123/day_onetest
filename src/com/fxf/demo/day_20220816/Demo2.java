package com.fxf.demo.day_20220816;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] split = input.nextLine().split(",");
        int m = Integer.valueOf(split[0]);
        int n = Integer.valueOf(split[1]);

        int[][] nums = new int[m][n];
        for (int i = 0; i < m; i++) {
            String[] split1 = input.nextLine().split(",");
            for (int j = 0; j < split1.length; j++) {
                nums[i][j] = Integer.valueOf(split1[j]);
            }
        }

        int result = 0;
        int[][] dp = new int[nums.length][nums[0].length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] == 1){
                    int temp1 = 0;
                    int temp2 = 0;
                    int temp3 = 0;
                    int temp4 = 0;
                    if ((i - 1 >= 0 && nums[i - 1][j] == 1)){
                        temp1 = dp[i - 1][j];
                    }
                    if ((i + 1 <= m - 1 && nums[i + 1][j] == 1)){
                        temp2 = dp[i + 1][j];
                    }
                    if ((j - 1 >= 0 && nums[i][j - 1] == 1)){
                        temp3 = dp[i][j - 1];
                    }
                    if ((j + 1 <= n - 1 && nums[i][j + 1] == 1)){
                        temp4 = dp[i][j + 1];
                    }
                    dp[i][j] = Math.max(Math.max(Math.max(temp1,temp2),temp3),temp4) + 1;
                    if (result < dp[i][j])
                        result = dp[i][j];
                }
            }
        }

        System.out.println(result);

    }
}


