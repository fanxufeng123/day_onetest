package com.fxf.demo9.day20220904;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String str1 = scanner.next();
        String stepResult1 = step1(str,str1);
        String stepResult2 = step2(stepResult1);
        System.out.println(step3(stepResult2));
    }

    private static String step1(String str, String str1) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str1);
        return sb.toString();
    }
    private static String step2(String str) {
        List<Character> list1 = new LinkedList<>();
        List<Character> list2 = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0){
                list1.add(str.charAt(i));
            }else {
                list2.add(str.charAt(i));
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        StringBuilder sb = new StringBuilder();
        int flag1 = 0;
        int flag2 = 0;
        while (flag1 != list1.size() || flag2 != list2.size()){
            if (flag1 != list1.size()){
                sb.append(list1.get(flag1));
                flag1++;
            }
            if (flag2 != list2.size()){
                sb.append(list2.get(flag2));
                flag2++;
            }
        }
        return sb.toString();
    }
    public static String step3(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char transverter = transverter(str.charAt(i));
            sb.append(transverter);
        }
        return sb.toString();


    }

    //转换2进制并且反转
    public static char transverter(char a){
        HashMap<Character,String>  charToTwo= new HashMap<>();
        charToTwo.put('0',"0000");
        charToTwo.put('1',"0001");
        charToTwo.put('2',"0010");
        charToTwo.put('3',"0011");
        charToTwo.put('4',"0100");
        charToTwo.put('5',"0101");
        charToTwo.put('6',"0110");
        charToTwo.put('7',"0111");
        charToTwo.put('8',"1000");
        charToTwo.put('9',"1001");
        charToTwo.put('a',"1010");
        charToTwo.put('b',"1011");
        charToTwo.put('c',"1100");
        charToTwo.put('d',"1101");
        charToTwo.put('e',"1110");
        charToTwo.put('f',"1111");
        HashMap<String,Character> twoToChar = new HashMap<>();
        twoToChar.put("0000",'0');
        twoToChar.put("0001",'1');
        twoToChar.put("0010",'2');
        twoToChar.put("0011",'3');
        twoToChar.put("0100",'4');
        twoToChar.put("0101",'5');
        twoToChar.put("0110",'6');
        twoToChar.put("0111",'7');
        twoToChar.put("1000",'8');
        twoToChar.put("1001",'9');
        twoToChar.put("1010",'A');
        twoToChar.put("1011",'B');
        twoToChar.put("1100",'C');
        twoToChar.put("1101",'D');
        twoToChar.put("1110",'E');
        twoToChar.put("1111",'F');
        if ((a >= '0' && a <= '9') || (a >= 'a' && a <= 'z') ){
            String s = charToTwo.get(a);
            String s1 = fanZhuang(s);
            return twoToChar.get(s1);
        }else if (a >= 'A' && a <= 'Z'){
            char temp = Character.toLowerCase(a);
            String s = charToTwo.get(a);
            String s1 = fanZhuang(s);
            return twoToChar.get(s1);
        }
        return '0';
    }

    //反转
    public static String fanZhuang(String a){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '0')
                sb.append('1');
            else if (a.charAt(i) == '1')
                sb.append('0');
        }
        return sb.toString();
    }

}
