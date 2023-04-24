package com.fxf.demo9.day20220908;

import com.fxf.demo9.structure.TreeNode;

import java.util.ArrayList;

public class Main1 {
    public static ArrayList<TreeNode> getBinaryTrees (ArrayList<Integer> preOrder, ArrayList<Integer> inOrder) {
        // write code here
        return count(preOrder,0,preOrder.size() - 1,inOrder,0,inOrder.size() - 1);
    }
    static ArrayList<TreeNode> count(ArrayList<Integer> preOrder, int preFront, int preEnd, ArrayList<Integer> inOrder, int inFront, int inEnd){
        ArrayList<TreeNode> result = new ArrayList<>();
        if (preEnd < preFront){
            result.add(null);
            return result;
        }
        int numberTemp = preOrder.get(preFront);
        int flagNum = inFront;
        for (int i = inFront; i <= inEnd; i++) {
            if (inOrder.get(i) == numberTemp){
                flagNum = i;
                ArrayList<TreeNode> left = count(preOrder,preFront + 1,preFront + flagNum - inFront,inOrder,inFront,flagNum - 1);
                ArrayList<TreeNode> right = count(preOrder,preFront + flagNum - inFront + 1,preEnd,inOrder,flagNum + 1,inEnd);
                for (TreeNode l :
                        left) {
                    for (TreeNode r :
                            right) {
                        TreeNode flag = new TreeNode(numberTemp);
//                        flag.left = l;
//                        flag.right = r;
                        result.add(flag);
                    }
                }
            }
        }
        return result;
    }
}
