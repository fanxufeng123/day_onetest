package com.fxf.demo9.day20220907;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int englishCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                englishCount++;
            }else if (str.charAt(i) == ' '){
                spaceCount++;
            }else if (str.charAt(i) >= '1' && str.charAt(i) <= '9'){
                numberCount++;
            }else {
                otherCount++;
            }
        }
        System.out.println(englishCount);
        System.out.println(spaceCount);
        System.out.println(numberCount);
        System.out.println(otherCount);
    }



}
