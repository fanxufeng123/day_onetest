package com.fxf.demo.day_20220724;

public class Demo9 {
    public static void main(String[] args) {

        int[] bills = new int[]{5,5,10,10,20};
        boolean b = lemonadeChange(bills);
        System.out.println(b);

    }

    public static boolean lemonadeChange(int[] bills) {

        int[] money = new int[3];   //手里的钱
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5){
                money[0]++;
            }else if (bills[i] == 10){
                money[0]--;
                money[1]++;
            }else {
                if (money[1] > 0){
                    money[1]--;
                    money[0]--;
                }else {
                    money[0] = money[0] - 3;
                }
            }
            for (int j = 0; j < 3; j++) {
                if (money[j] < 0){
                    return false;
                }
            }
        }

        return true;
    }
}
