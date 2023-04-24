package com.fxf.demo9.day20220911;

import com.fxf.demo9.structure.TreeNode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {

    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayDeque<TreeNode> arrayDeque = new ArrayDeque<>();
        List<Integer> result = new LinkedList<>();
        TreeNode temp = root;
        arrayDeque.addLast(root);
        while (!arrayDeque.isEmpty()){
            if (temp.left != null){
                arrayDeque.addLast(temp.left);
                temp = temp.left;
                continue;
            }
            temp = arrayDeque.removeLast();
            result.add(temp.val);
            temp.left = null;
            if (temp.right != null){
                arrayDeque.addLast(temp.right);
                temp = temp.right;
            }
        }
        return result;

    }
}
