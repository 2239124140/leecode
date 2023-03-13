package com.founder.leecode.leecode.$202211.$20221104;

import com.founder.leecode.leecode.$1BaseDO.TreeNode;

import java.util.*;

public class $4levelOrder {


    public static List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> curQueque = new LinkedList<>();
        Queue<TreeNode> nextQueque = new LinkedList<>();
        List<Integer> numList = new ArrayList<>();
        curQueque.add(root);
        while (!curQueque.isEmpty()){
            TreeNode remove = curQueque.remove();
            numList.add(remove.val);
            TreeNode left = remove.left;
            TreeNode right = remove.right;
            if(left!=null){
                nextQueque.add(left);
            }
            if(right!=null){
                nextQueque.add(right);
            }
            if(curQueque.isEmpty()){
                curQueque =  nextQueque;
                nextQueque = new LinkedList<>();
                result.addFirst(numList);
                numList = new ArrayList<>();
            }
        }
        return result;

    }
    public static void main(String[] args) {
        Integer[]  root ={3,9,20,null,null,15,7};
        TreeNode init = TreeNode.init(root);

        List<List<Integer>> lists = levelOrder(init);
        for (List<Integer> list : lists) {
            System.out.println(Arrays.toString(list.toArray()));
        }

    }
}
