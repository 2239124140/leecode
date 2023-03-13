package com.founder.leecode.leecode.$202210.$20220926;


import com.founder.leecode.leecode.$1BaseDO.$createTree;
import com.founder.leecode.leecode.$1BaseDO.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class $4getIntersectionNode {


    public static boolean isSymmetric(TreeNode root) {
        List<TreeNode> cur = new ArrayList<>();
        cur.add(root);
        boolean isContinue = false;
        do{
            isContinue = false;
            List<TreeNode> next = new ArrayList<>();
            for (TreeNode treeNode : cur) {
                if(treeNode==null){
                    next.add(null);
                    next.add(null);
                    continue;
                }
                if(treeNode.left!=null||treeNode.right!=null){
                    isContinue =true;
                }
            }
            cur = next;
            int nextsize = next.size();
            int nextstartIndex = 0 ;
            int nextendIndex = nextsize-1 ;
            while (nextstartIndex<nextendIndex){
                if(next.get(nextstartIndex)==null&&next.get(nextendIndex)==null){
                    nextstartIndex++;
                    nextendIndex--;
                    continue;
                }
                if(next.get(nextstartIndex)==null||next.get(nextendIndex)==null){
                    return false;
                }
                if(next.get(nextstartIndex).val!=next.get(nextendIndex).val){
                    return false;
                }
                nextstartIndex++;
                nextendIndex--;

            }
        }while (isContinue);
        return true;
    }



    public static void main(String[] args) {

        TreeNode tree = $createTree.createTree(new Integer[]{1,2,2,null,3,null,3});

        System.out.println(isSymmetric(tree));

    }
}
