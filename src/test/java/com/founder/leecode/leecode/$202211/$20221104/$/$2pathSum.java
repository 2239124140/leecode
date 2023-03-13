package com.founder.leecode.leecode.$202211.$20221104.$;

import com.founder.leecode.leecode.$1BaseDO.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class $2pathSum {


    public static List<List<Integer>>  pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result  = new ArrayList<>();
        LinkedList<Integer> sumList = new LinkedList<>();
        pathSum(root,0,targetSum,result,sumList);

        return result;
    }

    private static void pathSum(TreeNode root, int total, int targetSum, List<List<Integer>> result, LinkedList<Integer> sumList) {
        Integer val = root.val;
        total = root.val +total;
        sumList.add(val);
        if(root.right==null&&root.left==null){
            if(total==targetSum){
                result.add(new ArrayList<>(sumList));
            }
            return;
        }

        if(root.left!=null){
            pathSum(root.left,  total,  targetSum,result,sumList);
            sumList.pollLast();
        }
        if(root.right!=null){
            pathSum(root.right,  total,  targetSum,result,sumList);
            sumList.pollLast();
        }

    }

    public static void main(String[] args) {
        Integer[] root = {1,-2,-3,1,3,-2,null,-1};
        int targetSum = 2;
        List<List<Integer>> lists = pathSum(TreeNode.init(root), targetSum);
        for (List<Integer> list : lists) {
            System.out.println(Arrays.toString(list.toArray()));
        }

    }
}
