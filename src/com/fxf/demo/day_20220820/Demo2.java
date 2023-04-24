package com.fxf.demo.day_20220820;

import com.fxf.demo.data.structure.DoubleListNode;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> inputs = new LinkedList<>();
        String s = scanner.nextLine();
        Scanner st = new Scanner(s);
        while (st.hasNext()){
            inputs.add(s);
            s = scanner.nextLine();
        }


        List<Double> result = new ArrayList<>(inputs.size());
        while (!inputs.isEmpty()){
            result.add(getNumber(inputs.poll()));
        }
        for (Double aDouble : result){
            System.out.printf("%.0f%n", aDouble);
        }
    }

    private static double getNumber(String s){
        if (s.charAt(0) == '.' || s.charAt(0) == '0' || s.charAt(s.length() - 1) == '.'){
            return -1;
        }
        String[] parts = s.split("\\.");
        if (parts.length != 7){
            return -1;
        }
        int i = 56;
        double result = 0;
        for (String part :
                parts) {
            i -= 8;
            if (part.equals("") || part.equals("0")){
                continue;
            }
            int x = 0;
            for(char c : part.toCharArray()){
                if (c > '9' || c < '0'){
                    return -1;
                }
                x = x * 10 + c - '0';
            }
            if (x > 255 || x < 0){
                return -1;
            }
            result += x * Math.pow(2,i);
        }
        return result;
    }
}
