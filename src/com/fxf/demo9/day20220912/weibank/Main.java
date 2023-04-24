package com.fxf.demo9.day20220912.weibank;

import java.util.Scanner;

public class Main {
    public static int result = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            result = Integer.MAX_VALUE;
            long front = input.nextLong();
            long number = input.nextLong();
            minCount(front, number, 0);
            System.out.println(result == Integer.MAX_VALUE ? -1 : result);
        }
    }
    public static void minCount(long front, long number, int count){
        if (front == number){
            result = Math.min(result, count);
            return;
        }
        if (front % 8 == 0 && front / 8 >= number)
            minCount(front / 8, number, count + 1);
        else if (front % 4 == 0 && front / 4 >= number)
            minCount(front / 4, number, count + 1);
        else if (front % 2 == 0 && front / 2 >= number)
            minCount(front / 2, number, count + 1);
        if (front * 8 <= number)
            minCount(front * 8, number, count + 1);
        else if (front * 4 <= number)
            minCount(front * 4, number, count + 1);
        else if (front * 2 <= number)
            minCount(front * 2, number ,count + 1);

    }

}
