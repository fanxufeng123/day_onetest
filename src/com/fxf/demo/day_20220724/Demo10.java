package com.fxf.demo.day_20220724;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo10 {
    public static void main(String[] args) {

        int[][] people = new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] ints = reconstructQueue(people);
        System.out.println(" ");

    }

    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });

        LinkedList<int[]> que = new LinkedList<>();
        for(int[] p : people){
            que.add(p[1], p);
        }

        return que.toArray(new int[people.length][]);
    }


}
