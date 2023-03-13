package com.founder.leecode.leecode.$202211.$20221115;

import com.founder.leecode.leecode.$1BaseDO.TreeNode;

public class $4minDepth {


    public static int minDepth(TreeNode root) {
      if(root ==null){
         return 0;
      }
      if(root.left==null&&root.right==null){
          return 1;
      }
      int min = Integer.MAX_VALUE;

      if(root.left!=null){
          min =   Math.min( minDepth(root.left),min);
      }
      if(root.right!=null){
          min =   Math.min( minDepth(root.right),min);
      }
      return  min+1;
    }

    public static void main(String[] args) {

        Integer[]  root ={2,null,3,null,4,null,5,null,6};
        System.out.println(minDepth(TreeNode.init(root)));

    }
}
