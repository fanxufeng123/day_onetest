package com.fxf.demo9.day20220902;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,1,0,0,1,1};
        System.out.println(solution(arr));

    }
    public static int solution(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && arr[i] == 1){
                count++;
                continue;
            }
            if (arr[i] == 1 && arr[i - 1] == 0){
                count++;
            }
        }
        if (arr[arr.length - 1] == 0){
            return count * 2;
        }else {
            return count * 2 - 1;
        }
    }
}
