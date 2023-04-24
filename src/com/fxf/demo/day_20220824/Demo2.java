package com.fxf.demo.day_20220824;

import com.fxf.demo.data.structure.ListNode;
import com.fxf.demo.data.structure.test.ListNodeTest;

public class Demo2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int temp = 0;
        ListNode result = new ListNode();
        ListNode re = result;
        while (l1 != null || l2 != null){
            int value = 0;
            if (l1 == null) {
                value = l2.val + temp;
            }else if (l2 == null){
                value = l1.val+  temp;
            }else {
                value = l1.val + l2.val + temp;
            }
            temp = value / 10;
            value = value % 10;
            ListNode tempNode = new ListNode(value);
            re.next = tempNode;
            re = tempNode;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;

        }
        if (temp > 0){
            ListNode tempNode = new ListNode(temp);
            re.next = tempNode;
            re = tempNode;
        }
        return result.next;
    }

    public static void main(String[] args) {




    }
}
