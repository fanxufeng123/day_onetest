package com.fxf.demo9.day20220919;

import com.fxf.demo9.structure.TreeNode;

import java.util.LinkedList;

public class Main3 {
    static int height = 0;
    static int temp = 0;
    static LinkedList<Integer> flag = new LinkedList<>();
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(3);
        TreeNode treeNode6 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(4);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode4.left = treeNode6;
        treeNode4.right = treeNode7;
//        maxDepth(treeNode1);
//        Hashtable
        isBalanced(treeNode1);


    }

    public static boolean isBalanced(TreeNode root) {
        countHeight(root);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < flag.size(); i++) {
            if (flag.get(i) < min){
                min = flag.get(i);
            }
            if (flag.get(i) > max){
                max = flag.get(i);
            }
        }
        return max - min >= 2 ? false : true;
    }

    public static void countHeight(TreeNode root){
        if (root == null){
            flag.add(temp);
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
