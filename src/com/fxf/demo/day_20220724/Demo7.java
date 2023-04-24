package com.fxf.demo.day_20220724;

import org.junit.Test;

import java.util.Arrays;

public class Demo7 {
    public static void main(String[] args) {

        int[] gas = new int[]{1,2,3,4,5};
        int[] cost = new int[]{3,4,5,1,2};
        int i = canCompleteCircuit(gas, cost);
        System.out.println(i);
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int a = Arrays.stream(gas).sum();
        int b = Arrays.stream(cost).sum();
        if (a < b){
            return -1;
        }
        int[] leftGas = new int[gas.length];
        for (int i = 0; i < gas.length; i++) {
            leftGas[i] = gas[i] - cost[i];
        }
        int count = 0;
        int flag = 0;
        for (int i = 0; i < leftGas.length; i++) {
            count += leftGas[i];
            if (count < 0){
                flag = i + 1;
                count = 0;
            }
            if (i == leftGas.length - 1){
                return flag;
            }
        }
        return -1;
    }

}
