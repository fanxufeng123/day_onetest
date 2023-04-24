package com.fxf.demo.day_20220829;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (!scanner.hasNext("0")){
            int a = scanner.nextInt();
            int count = 0;
            while (a >= 2){
                if (a == 2){
                    count += 1;
                    break;
                }
                count += a / 3;
                a = a % 3 + a / 3;
            }
            list.add(count);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
