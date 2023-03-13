package com.founder.leecode.leecode.$202211.$20221105;

import com.founder.leecode.leecode.$1BaseDO.TreeNode;

public class $2sumNumbers {


    public static int sumNumbers(TreeNode root) {
         return sumNumbers(root,0);
    }

    private static int sumNumbers(TreeNode root, int cur) {
        cur = cur * 10 + root.val;
        if(root.left==null&&root.right==null){
            return cur;
        }
        int leftNum = 0;
        if(root.left!=null){
            leftNum =  sumNumbers(root.left,cur);
        }

        int rightNum = 0;
        if(root.right!=null){
            rightNum =  sumNumbers(root.right,cur);
        }
        return leftNum + rightNum;

    }

    public static void main(String[] args) {
       Integer[] root = {4,9,0,5,1};
        System.out.println(sumNumbers(TreeNode.init(root)));
    }
}
