package com.fxf.demo9.day20220918;

public class Main1 {
    public static void main(String[] args) {

    }

    public int candy (int[] arr) {
        // write code here
        int result = 1;
        int flag = 1;  //表示上一个孩子得糖果；
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]){
                result = result + flag + 1;
                flag++;
            }else if (arr[i] == arr[i - 1]){
                result = result + flag;
            }else {
                result += 1;
                flag = 1;
            }
        }
        return result;
    }
}
