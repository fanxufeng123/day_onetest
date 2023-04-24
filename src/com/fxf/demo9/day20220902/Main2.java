package com.fxf.demo9.day20220902;

import com.fxf.demo.data.structure.ListNode;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {
    public ListNode combineTwoDisorderNodeToOrder (ListNode node1, ListNode node2) {
        // write code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (node1 != null){
            arrayList.add(node1.val);
            node1 = node1.next;
        }
        while (node2 != null){
            arrayList.add(node2.val);
            node2 = node2.next;
        }
        int[] result = arrayList.stream().mapToInt(Integer::valueOf).toArray();
        Arrays.sort(result);
        ListNode root = new ListNode(0);
        ListNode temp = root;
        for (int i = 0; i < result.length; i++) {
            ListNode a = new ListNode(result[i]);
            temp.next = a;
            temp = a;
        }
        return root.next;
    }
}
