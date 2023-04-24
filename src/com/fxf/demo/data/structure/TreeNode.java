package com.fxf.demo.data.structure;

public class TreeNode {
    public int val;
    public TreeNode leftNode;
    public TreeNode rightNOde;

    public TreeNode() {
    }

    public TreeNode(int val, TreeNode leftNode, TreeNode rightNOde) {
        this.val = val;
        this.leftNode = leftNode;
        this.rightNOde = rightNOde;
    }

    public TreeNode(int val) {
        this.val = val;
    }
}
