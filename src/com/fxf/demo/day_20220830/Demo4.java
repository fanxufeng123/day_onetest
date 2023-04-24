package com.fxf.demo.day_20220830;

import java.util.*;

public class Demo4 {
    private static boolean[] vi_flag;
    private static boolean temp_flag = false;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        vi_flag = new boolean[n];
        char[] cols = input.next().toCharArray();
        int[][] bian = new int[n - 1][2];
        List<List<Integer>> tu = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tu.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            bian[i][0] = input.nextInt() - 1;
            bian[i][1] = input.nextInt() - 1;
            tu.get(bian[i][1]).add(bian[i][0]);
            tu.get(bian[i][0]).add(bian[i][1]);
        }
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            int[] temp_edg = bian[i];
            Arrays.fill(vi_flag,false);
            vi_flag[temp_edg[1]] = true;
            temp_flag = false;
            dfs(temp_edg[0],cols,new HashSet<>(),tu);
            if (!temp_flag)
                continue;
            temp_flag = false;
            vi_flag[temp_edg[0]] = true;
            dfs(temp_edg[1],cols,new HashSet<>(),tu);
            if (temp_flag)
                result++;
        }
        System.out.println(result);
    }
    private static void dfs(int i,char[] col,Set<Character> colorSet,List<List<Integer>> gra){
        vi_flag[i] = true;
        colorSet.add(col[i]);
        if (colorSet.size() == 3){
            temp_flag = true;
            return;
        }
        List<Integer> neighbors = gra.get(i);
        for (Integer neighbor :
                neighbors) {
            if (!vi_flag[neighbor]) {
                dfs(neighbor,col,colorSet,gra);
                if (temp_flag){
                    break;
                }
            }
        }
    }
}
