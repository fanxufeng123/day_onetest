package com.fxf.demo9.day20220926;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<hongbao> nums = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String[] str = scanner.nextLine().split(" ");
            nums.add(new hongbao(str[0], Integer.parseInt(str[1])));
        }
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i).id);
        }
    }
}
class hongbao implements Comparable<hongbao>{
    String id;
    int number;

    public hongbao(String id, int number) {
        this.id = id;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(hongbao o) {
        return o.number - this.number;
    }
}
