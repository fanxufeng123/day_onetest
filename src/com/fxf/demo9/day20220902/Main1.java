package com.fxf.demo9.day20220902;

public class Main1 {
    public static void main(String[] args) {
        int w = 3;
        int[] timeArr = new int[]{20,5,10,20,5,5};
        System.out.println(solution(w, timeArr));

    }

    public static String solution(int w, int[] timeArr){
        StringBuilder sb = new StringBuilder();
        int[] result = new int[w];
        for (int i = 0; i < w; i++) {
            result[i] = timeArr[i];
            sb.append(i + 1);
        }
        for (int i = w; i < timeArr.length; i++) {
            int index = indexNumber(result);
            sb.append(index + 1);
            result[index] += timeArr[i];
        }

        return sb.toString();
    }
    public static int indexNumber(int[] result){
        int minNumber = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            if (minNumber > result[i]){
                minNumber = result[i];
                index = i;
            }
        }
        return index;
    }
}
