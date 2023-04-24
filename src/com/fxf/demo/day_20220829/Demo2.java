package com.fxf.demo.day_20220829;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        hashMap.put('a',2);
        hashMap.put('b',2);
        hashMap.put('c',2);
        hashMap.put('d',3);
        hashMap.put('e',3);
        hashMap.put('f',3);
        hashMap.put('g',4);
        hashMap.put('h',4);
        hashMap.put('i',4);
        hashMap.put('j',5);
        hashMap.put('k',5);
        hashMap.put('l',5);
        hashMap.put('m',6);
        hashMap.put('n',6);
        hashMap.put('o',6);
        hashMap.put('p',7);
        hashMap.put('q',7);
        hashMap.put('r',7);
        hashMap.put('s',7);
        hashMap.put('t',8);
        hashMap.put('u',8);
        hashMap.put('v',8);
        hashMap.put('w',9);
        hashMap.put('x',9);
        hashMap.put('y',9);
        hashMap.put('z',9);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                sb.append(str.charAt(i));
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                sb.append(hashMap.get(str.charAt(i)));
            }else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Y'){
                char c = Character.toLowerCase(str.charAt(i));
                char d = (char)(c + 1) ;
                sb.append(d);
            }else if (str.charAt(i) == 'Z'){
                sb.append('a');
            }
        }
        System.out.println(sb.toString());
    }

}
