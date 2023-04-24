package com.fxf.demo9.day20220901;

import com.fxf.demo.data.structure.ListNode;

public class Main2 {
    public static void main(String[] args) {

    }

    public ListNode mergeNode (ListNode head) {
        // write code here
        ListNode root = new ListNode();
        ListNode root_flag = new ListNode();
        while (head != null && head.next != null){
            int a = head.val;
            int b = head.next.val;
            ListNode temp = new ListNode(a * b);
            root_flag.next = temp;
            root_flag = root_flag.next;
            head = head.next.next;
        }
        return root.next;
//        System.out.println();
    }
}
