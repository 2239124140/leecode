package com.founder.leecode.leecode.$202211.$20221104;

import com.founder.leecode.leecode.$1BaseDO.TreeNode;

public class $3isValidBST {


    public static boolean isValidBST(TreeNode root) {
       return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    private static boolean isValidBST(TreeNode root, int minValue, int maxValue) {
         if(root == null){
             return true;
         }
        Integer val = root.val;
        if(val>maxValue||val<minValue){
            return false;
        }

        return isValidBST(root.left,minValue,val)&&isValidBST(root.right,val,maxValue);

    }

    public static void main(String[] args) {
      Integer[] root = {5,4,6,null,null,3,7};
        TreeNode treeNode = TreeNode.init(root);
        TreeNode.toString(treeNode);
        System.out.println(isValidBST(treeNode));
    }
}
