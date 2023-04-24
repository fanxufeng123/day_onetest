package com.fxf.demo9.day20220908;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "abab";
        System.out.println(minOperations(str));

    }
    public static int minOperations (String str) {
        // write code here
        int[] nums = new int[26];
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            nums[str.charAt(i) - 'a']++;
        }

        int shengChar = 0;
        int countChar = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                shengChar++;
                continue;
            }
            if (nums[i] % 2 != 0){
                countChar += nums[i] / 2;
                result += nums[i] / 2;
                nums[i] = 1;
            }else {
                countChar = countChar + nums[i] / 2 - 1;
                result += nums[i] / 2;
                nums[i] = 1;
            }
        }
        while (countChar > shengChar){
            countChar -= 2;
            result++;
        }
        return result;
    }
    public static int remove(String str){
        char[] nums = str.toCharArray();
        int result = 0;
        int length = str.length();
        Map<Character,Integer> map = new HashMap<>();
        for (char it :
                nums) {
            map.put(it,map.getOrDefault(it,0) + 1);
        }
        for (Map.Entry<Character, Integer> temp :
                map.entrySet()) {
            int result_temp = temp.getValue() / 2;
            result += result_temp;
            length = length - result_temp;
        }
        if (length >26)
            result = result + length - 26;
        return result;
    }
}
