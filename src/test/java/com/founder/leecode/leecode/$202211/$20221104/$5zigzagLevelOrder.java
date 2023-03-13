package com.founder.leecode.leecode.$202211.$20221104;

import com.founder.leecode.leecode.$1BaseDO.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class $5zigzagLevelOrder {


    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<TreeNode> curQueque = new LinkedList<>();
        curQueque.add(root);

        boolean isNext = true;
        while (!curQueque.isEmpty()){
            int size = curQueque.size();
            List<Integer>   curList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = null;
                if(isNext){
                    cur = curQueque.pollFirst();
                    if(cur.left!=null){
                        curQueque.addLast(cur.left);
                    }
                    if(cur.right!=null){
                        curQueque.addLast(cur.right);
                    }
                }else{
                    cur = curQueque.pollLast();
                    if(cur.right!=null){
                        curQueque.addFirst(cur.right);
                    }
                    if(cur.left!=null){
                        curQueque.addFirst(cur.left);
                    }

                }

                curList.add(cur.val);
            }
            result.add(curList);
            isNext =!isNext;
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[]  root ={3,9,20,null,null,15,7};
        TreeNode init = TreeNode.init(root);

        List<List<Integer>> lists = zigzagLevelOrder(init);
        for (List<Integer> list : lists) {
            System.out.println(Arrays.toString(list.toArray()));
        }

    }
}
