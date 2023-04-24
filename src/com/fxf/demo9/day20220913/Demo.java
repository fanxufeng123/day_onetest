package com.fxf.demo9.day20220913;

class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

public class Demo {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        ListNode listNode = reorderList(a);
        System.out.println(listNode.val);
        System.out.println(listNode.next.val);
        System.out.println(listNode.next.next.val);
        System.out.println(listNode.next.next.next.val);


    }

    public static ListNode reorderList(ListNode head){

        ListNode front = head;
        while (head.next.next != null){
            head = head.next;
        }
        head.next.next = front;
        ListNode result = head.next;
        head.next = null;
        return result;
    }
}
