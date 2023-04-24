package com.fxf.demo9.day20220911;

import com.fxf.demo9.structure.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) {

    }

    public static List<Integer> preorderTraversal(TreeNode root) {

        ArrayDeque<TreeNode> result = new ArrayDeque<>();
        List<Integer> number = new ArrayList<>();
        if (root == null){
            return number;
        }
        result.addLast(root);
        while (!result.isEmpty()){
            TreeNode node = result.removeLast();
            number.add(node.val);
            if (node.right != null){
                result.addLast(node.right);
            }
            if (node.left != null){
                result.addLast(node.left);
            }
        }
        return number;

    }

}
