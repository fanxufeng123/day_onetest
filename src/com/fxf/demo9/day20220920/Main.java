package com.fxf.demo9.day20220920;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<int[]> intervals = new LinkedList<>();
        String s1 = scanner.nextLine();
        while (!s1.equals("")){
            String[] s = s1.split(" ");
            int[] temp = new int[]{Integer.parseInt(s[0]),Integer.parseInt(s[1])};
            intervals.add(temp);
            s1 = scanner.nextLine();
        }
        int[][] merge = merge(intervals.toArray(new int[intervals.size()][2]));
        int result = 0;
        for (int i = 0; i < merge.length; i++) {
            result += (merge[i][1] - merge[i][0]);
        }
        System.out.println(result);
    }

    public static int[][] merge(int[][] intervals){
        int len = intervals.length;
        if (len == 1){
            return intervals;
        }
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();
        int[] tmp = intervals[0];
        list.add(tmp);
        for (int i = 1; i < len; i++) {
            if (tmp[1] < intervals[i][0]){
                list.add(intervals[i]);
                tmp = intervals[i];
            }else if (tmp[1] <= intervals[i][1]){
                list.remove(tmp);
                tmp = new int[]{tmp[0],intervals[i][1]};
                list.add(tmp);
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}
