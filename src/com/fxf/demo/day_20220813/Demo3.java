package com.fxf.demo.day_20220813;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        deque.addFirst(nums[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < 2; j++) {
                deque.addFirst(deque.pollLast());
            }
            deque.addFirst(nums[i]);
        }
        for (int j = 0; j < 2; j++) {
            deque.addFirst(deque.pollLast());
        }
        while (!deque.isEmpty()){
            System.out.print(deque.pollFirst() + " ");
        }
    }

}
