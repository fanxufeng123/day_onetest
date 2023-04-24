package com.fxf.demo.data.structure;

import java.util.Objects;

public class DoubleListNode {
    int val;
    DoubleListNode frontNode;
    DoubleListNode nextNode;

    public DoubleListNode() {
    }

    public DoubleListNode(int val, DoubleListNode frontNode, DoubleListNode nextNode) {
        this.val = val;
        this.frontNode = frontNode;
        this.nextNode = nextNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoubleListNode that = (DoubleListNode) o;
        return val == that.val &&
                Objects.equals(frontNode, that.frontNode) &&
                Objects.equals(nextNode, that.nextNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, frontNode, nextNode);
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public DoubleListNode getFrontNode() {
        return frontNode;
    }

    public void setFrontNode(DoubleListNode frontNode) {
        this.frontNode = frontNode;
    }

    public DoubleListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoubleListNode nextNode) {
        this.nextNode = nextNode;
    }
}
