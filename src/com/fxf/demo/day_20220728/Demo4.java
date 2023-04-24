package com.fxf.demo.day_20220728;

import java.util.Arrays;
import java.util.LinkedList;

public class Demo4 {

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        int[][] merge = merge(intervals);
        System.out.println("  ");

    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a, b)->{
            return Integer.compare(a[0],b[0]);
        });
        LinkedList<int[]> linkedList = new LinkedList<>();

        int front = intervals[0][0];
        int end = intervals[0][1];
        int count = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end){
                end = Math.max(end, intervals[i][1]);
                continue;
            }
            linkedList.add(new int[]{front,end});
            count++;
            front = intervals[i][0];
            end = intervals[i][1];
        }
        linkedList.add(new int[]{front,end});
        count++;

        return linkedList.toArray(new int[count][]);
    }
}
