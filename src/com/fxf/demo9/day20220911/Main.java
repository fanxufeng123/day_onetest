package com.fxf.demo9.day20220911;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] nums = str.toCharArray();

        List<Character> list = new LinkedList<>();
        List<Integer> list1 = new LinkedList<>();
        int front = 0;
        int end = 0;
        while (front < str.length()){
            end++;
            if (end < str.length() && nums[end] == nums[front]){
                continue;
            }else {
                list.add(nums[front]);
                list1.add(end - front);
                front = end;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (list1.get(i) != 1){
                System.out.print(list1.get(i));
            }
        }
    }
}
