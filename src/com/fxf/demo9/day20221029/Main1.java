package com.fxf.demo9.day20221029;

import com.fxf.demo.data.structure.ListNode;
import com.fxf.demo.day_20220830.Father;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(5);
        ListNode g = new ListNode(3);
        ListNode h = new ListNode(3);
        ListNode i = new ListNode(3);
        ListNode j = new ListNode(4);
        ListNode k = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
        j.next = k;
        reverseList(a);

    }
    public static ListNode reverseList (ListNode head) {
        // write code here
        List<Integer> list = new ArrayList<>();
        while (head.next != null){
            list.add(head.val);
            head = head.next;
        }
        list.add(head.val);
        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        List<Integer> flag = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] && i + 1 < nums.length && nums[i] == nums[i + 1]){
                continue;
            }
            if (nums[i] != nums[i - 1] && i + 1 < nums.length && nums[i] == nums[i + 1]){
                flag.add(i);
            }
            if (nums[i] == nums[i - 1] && i + 1 < nums.length && nums[i] != nums[i + 1]){
                flag.add(i);
            }
        }

        int[] result = new int[list.size()];
        int count = 0;
        int front = 0;
        for (int i = 0; i < flag.size(); i++) {
            int end = flag.get(i);
            int[] number = new int[end - front];
            int temp = 0;
            for (int j = front; j < end; j++) {
                number[temp] = nums[j];
                temp++;
            }
            front = flag.get(i + 1) + 1;
            i++;


            int[] fanzhuan = Fanzhuan(number);
            for (int j = 0; j < fanzhuan.length; j++) {
                result[count] = fanzhuan[j];
                count++;
            }
        }

        ListNode root = new ListNode();
        ListNode ffff = root;
        for (int i = 0; i < result.length; i++) {
            ListNode temp = new ListNode(result[i]);
            root.next = temp;
            root = root.next;
        }
        return ffff.next;
    }
    public static int[] Fanzhuan(int[] number){
        if (number.length < 2 || number[0] == number[1]){
            return number;
        }
        int[] result = new int[number.length];
        int flag = 0;
        for (int i = number.length - 1; i >= 0 ; i++) {
            result[flag] = number[i];
            flag++;
        }
        return result;
    }
}
