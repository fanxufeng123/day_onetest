package com.fxf.demo9.structure;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val, TreeNode leftNode, TreeNode rightNOde) {
        this.val = val;
        this.left = leftNode;
        this.right = rightNOde;
    }

    public TreeNode(int val) {
        this.val = val;
    }
}
