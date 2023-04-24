package com.fxf.demo9.day20220917;

import com.fxf.demo9.structure.TreeNode;

public class Demo1 {
    static int flag = Integer.MIN_VALUE;
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        System.out.println(isValidBST(treeNode));

    }
    public static boolean isValidBST(TreeNode root) {
        return dfs(root);
    }

    public static boolean dfs(TreeNode root){
        if (root == null){
            return true;
        }
        if(!dfs(root.left)){
            return false;
        }
        if (root.val > flag){
            flag = root.val;
        }else {
            return false;
        }
        if(!dfs(root.right)){
            return false;
        }else {
            return true;
        }

    }
}
