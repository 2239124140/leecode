package com.founder.leecode.leecode.$202211.$20221115;

import com.founder.leecode.leecode.$1BaseDO.TreeNode;

public class $3isBalanced {


    public static boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
      return   deep(root.left)-deep(root.right)<2 &&isBalanced(root.left) &&isBalanced(root.right);
    }

    private static int deep(TreeNode root) {
        if(root==null){
            return 0 ;
        }
       if(root.left==null&&root.right==null){
           return 1;
       }
       return Math.max( deep(root.left), deep(root.right) )+1;
    }

    public static void main(String[] args) {
        Integer[]  root1 ={1,2};
        System.out.println(isBalanced(TreeNode.init(root1)));

    }
}
