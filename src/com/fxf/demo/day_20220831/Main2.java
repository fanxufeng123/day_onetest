package com.fxf.demo.day_20220831;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numFront = new int[n];
        int[] numEnd = new int[n];
        for (int i = 0; i < n; i++) {
            numFront[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            numEnd[i] = scanner.nextInt();
        }

        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int flagFront = numFront[i];
            for (int j = 0; j < n; j++) {
                if (numEnd[j] == flagFront){
                    int number = number(i, j, numFront, numEnd);
                    result.add(number);
                    break;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < result.size(); i++) {
            if (max <= result.get(i)){
                max = result.get(i);
            }
        }
        System.out.println(max);
    }
    public static int number(int front, int end, int[] numFront, int[] numEnd){
        int[] tempFront = new int[numFront.length - front - 1];
        int flag = 0;
        int[] tempEnd = new int[end];
        for (int i = front + 1; i < numFront.length; i++) {
            tempFront[flag] = numFront[i];
            flag++;
        }
        flag = 0;
        for (int i = 0; i < end; i++) {
            tempEnd[flag] = numEnd[i];
            flag++;
        }
        int count = 0;
        for (int i = 0; i < tempFront.length; i++) {
            for (int j = 0; j < tempEnd.length; j++) {
                if (tempFront[i] == tempEnd[j]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
