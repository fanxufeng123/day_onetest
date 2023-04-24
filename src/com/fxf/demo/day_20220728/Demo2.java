package com.fxf.demo.day_20220728;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {

        int[][] points = new int[][]{{1,100},{11,22},{1,11},{2,12}};
        int minArrowShots = findMinArrowShots(points);
        System.out.println(minArrowShots);

    }

    public static int findMinArrowShots(int[][] points) {
        int result = 0;
        Arrays.sort(points,(a,b)->{
            return Integer.compare(a[0],b[0]);
        });
        int front = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] < front){
                result++;
                front = Math.min(front,points[i][1]);
                continue;
            }
            front = points[i][1];
        }

        return result;
    }
}
