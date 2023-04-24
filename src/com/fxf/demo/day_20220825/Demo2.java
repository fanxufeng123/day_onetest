package com.fxf.demo.day_20220825;

import java.util.HashSet;

public class Demo2 {
    int result = 0;
    int[][] temp_node;
    public int DagPathNum (int[][] nodes) {
        // write code here
        temp_node = nodes;
        shenduDie(0,nodes.length - 1, new HashSet<String>(),"_" + 0);
        return result;
    }
    
    private void shenduDie(int front, int end, HashSet<String> set_temp, String str){
        if (front == end){
            set_temp.add(str);
            result = set_temp.size();
        }
        for (int i :
                temp_node[front]) {
            shenduDie(i,end,set_temp,str + "_" + i);
        }
    }
}
