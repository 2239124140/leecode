package com.founder.leecode.leecode.$202210.$20220921;

import java.util.ArrayList;
import java.util.List;

public class  $1threeSum {
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

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return  inorderTraversal(root,result);
    }

    private static List<Integer> inorderTraversal(TreeNode root, List<Integer> result) {
        if(root==null){
            return result;
        }
        if(root.left!=null){
             inorderTraversal(root.left,result);
        }
        if(root.val!=null){ result.add(root.val);}
        if(root.right!=null){
             inorderTraversal(root.right,result);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(null);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode.left = treeNode1;
        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;
        List<Integer> list = inorderTraversal(treeNode);
        for (Integer integer : list) {
            System.out.print(integer);
        }

    }
}
