package com.founder.leecode.leecode.$202210.$20220921;


import java.util.ArrayDeque;
import java.util.Queue;

public class $2maxDepth {
    public  static  class TreeNode {
        Integer val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(Integer val) { this.val = val; }
        TreeNode(Integer val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left =  maxDepth(root.left)+1;
        int right =  maxDepth(root.right)+1;
        return left>right?left:right;
    }



    public static void main(String[] args) {
        Integer[] nums = {3,9,20,null,null,15,7};
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
        System.out.println(maxDepth(root));

    }
}
