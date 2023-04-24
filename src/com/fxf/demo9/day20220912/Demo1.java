package com.fxf.demo9.day20220912;

import com.fxf.demo9.structure.TreeNode;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo1 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayDeque<TreeNode> arrayDeque = new ArrayDeque<>();
        List<List<Integer>> result = new LinkedList<>();
        if (root == null){
            return result;
        }
        arrayDeque.addLast(root);
        int flag = 1;
        while (!arrayDeque.isEmpty()){
            int temp  =0;
            List<Integer> result_temp = new LinkedList<>();
            for (int i = 0; i < flag; i++) {
                TreeNode node = arrayDeque.removeFirst();
                result_temp.add(node.val);
                if (node.left != null){
                    temp++;
                    arrayDeque.addLast(node.left);
                }
                if (node.right != null){
                    temp++;
                    arrayDeque.addLast(node.right);
                }
            }
            flag = temp;
            result.add(result_temp);
        }
        return result;
    }
}
