package com.fxf.demo.data.structure;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.LinkedList;
import java.util.Objects;

public class ListNode {
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
