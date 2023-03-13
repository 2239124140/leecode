package com.founder.leecode.leecode.$202211.$20221115;

import com.founder.leecode.leecode.$1BaseDO.TreeNode;

public class $2isSameTree {


    public static boolean isSameTree(TreeNode p, TreeNode q) {
       return isSameTreeMore(p,q);
    }

    private static boolean isSameTreeMore(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if(p==null&&q!=null){
            return false;
        }
        if(p!=null&&q==null){
            return false;
        }
        if(p.val== q.val){
            return isSameTreeMore(p.left,q.left)&&  isSameTreeMore(p.right,q.right);
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Integer[]  root1 ={1,2,1};
        Integer[]  root2 ={1,1,2};
        isSameTree(TreeNode.init(root1),TreeNode.init(root2));

    }
}
