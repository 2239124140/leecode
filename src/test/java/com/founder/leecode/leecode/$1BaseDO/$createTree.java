package com.founder.leecode.leecode.$1BaseDO;

import java.util.ArrayDeque;
import java.util.Queue;

public class $createTree {
    public static TreeNode createTree( Integer[] nums) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        TreeNode root = new TreeNode(nums[0]);
        queue.add( root);
        int i=1;
        while (!queue.isEmpty()){
            TreeNode dequeue = queue.remove();
            if(i<nums.length){
                Integer left = nums[i++];
                Integer right = nums[i++];
                if(left !=null){
                    dequeue.left =  new TreeNode(left);
                    queue.add( dequeue.left);
                }
                if(right !=null){
                    dequeue.right =  new TreeNode(right);
                    queue.add( dequeue.right);
                }
            }
        }
        return root;
    }

}
