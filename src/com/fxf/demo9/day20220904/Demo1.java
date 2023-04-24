package com.fxf.demo9.day20220904;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(cryptographic(str1));

    }
    public static String cryptographic(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')){
                if (str.charAt(i) >= 'A' && str.charAt(i) < 'Z'){
                    sb.append(Character.toLowerCase(str.charAt(i) + 1));
                }else if (str.charAt(i) == 'Z'){
                    sb.append('a');
                }else if (str.charAt(i) >= 'a' && str.charAt(i) < 'z'){
                    sb.append(Character.toUpperCase((char) (str.charAt(i) + 1)));
                }else if (str.charAt(i) == 'z'){
                    sb.append('A');
                }
                continue;
            }else if (str.charAt(i) >= '0' && str.charAt(i) < '9'){
                sb.append(str.charAt(i) + 1);
                continue;
            }else if (str.charAt(i) == '9'){
                sb.append('0');
                continue;
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
