package com.fxf.demo.day_20220806;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[][] arr = new int[2][t];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < t; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int count = 0;
        if (t % 2 == 0){
            count = t / 2;
        }else {
            count = t / 2 + 1;
        }

        Map<Integer,Integer> zhengMap = new HashMap<>();
        Map<Integer,Integer> fanMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            if (arr[0][i] == arr[1][i]){
                if (zhengMap.get(arr[0][i]) == null){
                    zhengMap.put(arr[0][i],1);
                }else {
                    zhengMap.put(arr[0][i],zhengMap.get(arr[0][i]) + 1);
                }
                continue;
            }
            if (zhengMap.get(arr[0][i]) == null){
                zhengMap.put(arr[0][i],1);
            }else {
                zhengMap.put(arr[0][i],zhengMap.get(arr[0][i]) + 1);
            }
            if (fanMap.get(arr[1][i]) == null){
                fanMap.put(arr[1][i],1);
            }else {
                fanMap.put(arr[1][i],fanMap.get(arr[1][i]) + 1);
            }
        }
        int result = t;
        for (Map.Entry<Integer, Integer> entry : zhengMap.entrySet()) {
            if (entry.getValue() >= count){
                System.out.println(0);
                return;
            }
            int key = entry.getKey();
            int value = entry.getValue();
            if (fanMap.get(key) == null){
                continue;
            }else {
                if (value + fanMap.get(key) >= count){
                    int temp = count - value;
                    if (temp < result){
                        result = temp;
                    }
                }
            }
        }
        if (result == t){
            for (Map.Entry<Integer, Integer> entry : zhengMap.entrySet()) {
                if (entry.getValue() >= count){
                    System.out.println(count);
                    return;
                }
            }
        }
        System.out.println(result);

    }

}
