package com.fxf.demo9.day20220912;

import com.fxf.demo9.structure.TreeNode;

public class Demo3 {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (dieDai(left, right))
            return true;
        else
            return false;

    }
    public boolean dieDai(TreeNode left, TreeNode right){
        if (left == null && right == null){
            return true;
        }
        if (left != null && right == null){
            return false;
        }if (left == null && right != null){
            return false;
        }
        if (left.val != right.val){
            return false;
        }
        if(dieDai(left.left, right.right)){
            if (dieDai(left.right, right.left)){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }

    }
}
