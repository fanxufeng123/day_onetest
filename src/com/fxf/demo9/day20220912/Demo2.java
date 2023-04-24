package com.fxf.demo9.day20220912;

import com.fxf.demo9.structure.TreeNode;

public class Demo2 {
    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return root;
        }
        dieDai(root, root.left, root.right);
        return root;
    }

    public void dieDai(TreeNode root, TreeNode left, TreeNode right){
        if (left != null){
            dieDai(left, left.left, left.right);
        }
        if (right != null){
            dieDai(right, right.left, right.right);
        }
        TreeNode temp = left;
        root.left = right;
        root.right = temp;
    }
}
