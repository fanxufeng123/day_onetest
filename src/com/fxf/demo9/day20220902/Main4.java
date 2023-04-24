package com.fxf.demo9.day20220902;

import java.util.Arrays;

public class Main4 {
    public int maxDigit (int[] digits) {
        // write code here
        Integer[] input = Arrays.stream(digits).boxed().toArray(Integer[]::new);
        Arrays.sort(input,(a,b) -> {
            String m = String.valueOf(a);
            String n = String.valueOf(b);
            return (n + m).compareTo(m + n);
        });
        if (input[0] == 0)
            return Integer.parseInt("0");
        StringBuffer res = new StringBuffer();
        for(int t : input)
            res.append(t);
        return  Integer.parseInt(res.toString());
    }
}
