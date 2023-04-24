package com.fxf.demo.data.structure.test;

import com.fxf.demo.data.structure.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class TreeNodeTest {
    public static void main(String[] args) {
        preorderTraversal(new TreeNode());

    }

    //前序遍历
    public static List<Integer> preorderTraversal(TreeNode root){
        LinkedList<Integer> result = new LinkedList<>();
        preorder(root,result);
        return result;
    }

    private static void preorder(TreeNode root,LinkedList<Integer> result) {
        if (root == null){
            return;
        }
        result.add(root.val);
        preorder(root.leftNode,result);
        preorder(root.rightNOde,result);
    }

    //前序遍历----迭代
    public List<Integer> preorderTraver(TreeNode root){
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack();
        if (root == null){
            return null;
        }
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode pop = stack.pop();
            result.add(pop.val);
            if (pop.rightNOde != null){
                stack.push(pop.rightNOde);
            }
            if (pop.leftNode != null){
                stack.push(pop.rightNOde);
            }
        }
        return result;
    }

    //中序遍历----迭代
    public List<Integer> inorderTraver(TreeNode root){
        if (root == null){
            return null;
        }
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;   //指针的作用
        while (cur != null || !stack.isEmpty()){
            if (cur != null){
                stack.push(cur);
                cur = cur.leftNode;
            }else {
                cur = stack.pop();
                result.add(cur.val);
                cur = cur.rightNOde;
            }
        }
        return result;
    }
}
