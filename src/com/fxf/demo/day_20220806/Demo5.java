package com.fxf.demo.day_20220806;

import java.util.Map;

public class Demo5 {
    public class Point {
    int x;
   int y;
   public Point(int x, int y) {
     this.x = x;
     this.y = y;
   }
  }
    public long getArea (Point p1, Point p2, Point p3, Point p4) {
        // write code here
        double s1 = Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
        double s2 = Math.sqrt((p3.x - p2.x) * (p3.x - p2.x) + (p3.y - p2.y) * (p3.y - p2.y));
        double s3 = Math.sqrt((p3.x - p4.x) * (p3.x - p4.x) + (p3.y - p4.y) * (p3.y - p4.y));
        double s4 = Math.sqrt((p1.x - p4.x) * (p1.x - p4.x) + (p1.y - p4.y) * (p1.y - p4.y));

        double s5 = Math.sqrt((p1.x - p3.x) * (p1.x - p3.x) + (p1.y - p3.y) * (p1.y - p3.y));

        double x1 = (s1 + s2 + s5) / 2;
        double x2 = (s3 + s4 + s5) / 2;
        double result1 = Math.sqrt(x1 * (x1 - s1) * (x1 - s2) * (x1 - s5));
        double result2 = Math.sqrt(x2 * (x2 - s3) * (x2 - s4) * (x2 - s5));
        return Math.round(result1 + result2);


    }
}
