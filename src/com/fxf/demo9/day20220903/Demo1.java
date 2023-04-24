package com.fxf.demo9.day20220903;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[str.length - 1]);

        String flag = str[str.length - 2];
        int length = flag.length();
        int count = 0;
        List<String> result = new LinkedList<>();
        String[] strnums = new String[str.length - 3];
        for (int i = 0; i < strnums.length; i++) {
            strnums[i] = str[i + 1];
        }
        for (int i = 0; i < strnums.length; i++) {
            if (strnums[i].length() != length || strnums[i].equals(flag)){
                continue;
            }else {
                if(strCompare(flag, strnums[i]))
                    result.add(strnums[i]);
            }
        }
        System.out.println(result.size());
        Collections.sort(result);
        for (int i = 0; i < result.size(); i++) {
            if (i == k - 1){
                System.out.println(result.get(i));
            }
        }
    }

    public static boolean strCompare(String a, String b){
        HashMap<Character,Integer> aHash = new HashMap<>();
        HashMap<Character,Integer> bHash = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (aHash.containsKey(a.charAt(i))){
                aHash.put(a.charAt(i),aHash.get(a.charAt(i)) + 1);
            }else {
                aHash.put(a.charAt(i), 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (bHash.containsKey(b.charAt(i))){
                bHash.put(b.charAt(i),bHash.get(b.charAt(i)) + 1);
            }else {
                bHash.put(b.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> it :
                aHash.entrySet()) {
            char aTemp = it.getKey();
            int aCount = it.getValue();
            if (!bHash.containsKey(aTemp) || bHash.get(aTemp) != aCount){
                return false;
            }
        }
        return true;
    }
}
