package com.founder.leecode.leecode.$202211.$20221104.$;

import com.founder.leecode.leecode.$1BaseDO.TreeNode;

public class $1hasPathSum {

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSum(root,0,targetSum);
    }

    private static boolean hasPathSum(TreeNode root, Integer cur, int targetSum) {
        cur = root.val + cur;
        if(root.left==null&&root.right==null){
            if(targetSum==cur){
                return true;
            }else {
                return false;
            }
        }

        boolean left =   false;
        boolean right =  false;
        if(root.left!=null){
            left =   hasPathSum(root.left,cur,targetSum);
        }
        if(root.right!=null){
            right =   hasPathSum(root.right,cur,targetSum);
        }
        return left||right;
    }

    public static void main(String[] args) {
        Integer[] root = {5,4,8,11,null,13,4,7,2,null,null,null,1};
        int targetSum = 22;
        boolean b = hasPathSum(TreeNode.init(root), targetSum);
        System.out.println(b);

    }
}
