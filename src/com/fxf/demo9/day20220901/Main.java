package com.fxf.demo9.day20220901;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        List<List<Character>> lists = new LinkedList<>();
        for (int i = 0; i < 26; i++) {
            lists.add(new LinkedList<>());
        }
        List<Character> illegalChar = new LinkedList<>();
        List<Integer> illegalCharNumber = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) >= 'a' && Character.toLowerCase(str.charAt(i)) <= 'z'){
                int temp = Character.toLowerCase(str.charAt(i)) - 'a';
                lists.get(temp).add(str.charAt(i));
            }else {
                illegalChar.add(str.charAt(i));
                illegalCharNumber.add(i);
            }
        }
        List<Character> result = new LinkedList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < lists.get(i).size(); j++) {
                result.add(lists.get(i).get(j));
            }
        }
        for (int i = 0; i < illegalChar.size(); i++) {
            result.add(illegalCharNumber.get(i),illegalChar.get(i));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i));
        }
        System.out.println(sb);
    }
}
