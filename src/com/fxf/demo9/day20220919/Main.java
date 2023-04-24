package com.fxf.demo9.day20220919;

import com.fxf.demo9.day20220918.Tree;
import com.fxf.demo9.structure.TreeNode;

import java.util.HashMap;
import java.util.Hashtable;

public class Main {
    static int height = 0;
    static int temp = 0;
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        maxDepth(treeNode1);
//        Hashtable


    }

    public static int maxDepth(TreeNode root) {
        countHeight(root);
        return height;
    }

    public static void countHeight(TreeNode root){
        if (root == null){
            return;
        }
        temp++;
        if (temp > height){
            height = temp;
        }
        countHeight(root.left);
        countHeight(root.right);
        temp--;
    }
}
