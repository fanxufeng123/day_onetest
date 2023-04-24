package com.fxf.demo9.day20220917;

import com.fxf.demo.day_20220830.Interface;
import com.fxf.demo9.structure.TreeNode;

import java.util.ArrayDeque;

public class Demo2 {
    static ArrayDeque<TreeNode> arrayDeque = new ArrayDeque<>();
    static TreeNode flag1 = null;
    static TreeNode flag2 = null;
    static int count = 0;
    public static void main(String[] args) {
        long a = Long.MIN_VALUE;

    }

    public static void recoverTree(TreeNode root) {
        arrayDeque.addLast(new TreeNode(Integer.MIN_VALUE));
        dfs(root);
        int temp = flag1.val;
        flag1.val = flag2.val;
        flag2.val = temp;
    }

    private static void dfs(TreeNode root) {
        if (root == null){
            return;
        }
        dfs(root.left);
        TreeNode treeNode = arrayDeque.removeLast();
        if (root.val < treeNode.val){
            if (count == 0){
                flag1 = treeNode;
                flag2 = root;
                count++;
            }else {
                flag2 = root;
            }
        }
        arrayDeque.addLast(treeNode);
        arrayDeque.addLast(root);
        dfs(root.right);
    }
}
