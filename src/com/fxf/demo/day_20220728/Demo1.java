package com.fxf.demo.day_20220728;

import java.util.Arrays;

public class Demo1 {

    public static void main(String[] args) {

        int[][] points = new int[][]{{10,16},{2,8},{1,6},{7,12}};
        int minArrowShots = findMinArrowShots(points);
        System.out.println(minArrowShots);

    }

    public static int findMinArrowShots(int[][] points) {
        int result = 1;
        Arrays.sort(points, (x, y) -> Integer.compare(x[0], y[0]));
        int front = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= front){
                front = Math.min(front , points[i][1]);
                continue;
            }
            result++;
            front = points[i][1];
        }

        return result;
    }
}
