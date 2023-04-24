package com.fxf.demo.day_20220814;

import java.util.*;
//[[2],[3],[1],[]]
public class Demo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] split = input.nextLine().split("]");
        int n = split.length;
        LinkedList<LinkedList<Integer>> linkedList = new LinkedList<>();

        LinkedList<Integer> temp = new LinkedList<>();
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < split[i].length(); j++) {
                if (split[i].charAt(j) != '[' && split[i].charAt(j) != ','){
                    temp.add((int)split[i].charAt(j) - 48);
                }
            }
            linkedList.add(new LinkedList<>(temp));
            temp.removeAll(temp);
        }

        int[] flag = new int[n];
        LinkedList<Integer> tempResult = new LinkedList<>();
        tempResult = linkedList.get(0);
        flag[0] = 1;
        while (tempResult.size() != 0){
            LinkedList<Integer> temp1 = new LinkedList<>();
            for (int i = 0; i < tempResult.size(); i++) {
                flag[tempResult.get(i)] = 1;
                for (int j = 0; j < linkedList.get(tempResult.get(i)).size(); j++) {
                    temp1.add(linkedList.get(tempResult.get(i)).get(j));
                }
            }
            tempResult.removeAll(tempResult);
            tempResult = temp1;
        }
        for (int i = 0; i < n; i++) {
            if (flag[i] == 0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);




    }

}
