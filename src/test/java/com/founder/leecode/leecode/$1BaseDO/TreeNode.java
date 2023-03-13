package com.founder.leecode.leecode.$1BaseDO;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

@Data
public class TreeNode {
   public Integer val;
   public TreeNode left;
   public TreeNode right;
   public  TreeNode() {}
   public TreeNode(Integer val) { this.val = val; }
   TreeNode(Integer val, TreeNode left,TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
   }

    public static void toString(TreeNode treeNode) {
        Queue<TreeNode> queue = new LinkedBlockingDeque<>();
        queue.add(treeNode);
        while (!queue.isEmpty()){
            TreeNode pop = queue.remove();
            System.out.println(pop.val);
            if(pop.left!=null){
                queue.add(pop.left);
            }
            if(pop.right!=null){
                queue.add(pop.right);
            }
        }
    }


    public static TreeNode init(Integer[] root) {
        TreeNode treeNode = new TreeNode(root[0]);
        List<TreeNode> list = new ArrayList<>();
        list.add(treeNode);
        int i =1;
        while (i<root.length){
            List<TreeNode> next = new ArrayList<>();
            for (TreeNode node : list) {
                if(i>=root.length){
                    break;
                }
                Integer left = root[i++];
                if(left!=null){
                    TreeNode treeNode1 = new TreeNode(left);
                    node.setLeft(treeNode1);
                    next.add(treeNode1);
                }

                if(i>=root.length){
                    break;
                }
                Integer right = root[i++];
                if(right!=null){
                    TreeNode treeNode1 = new TreeNode(right);
                    node.setRight(treeNode1);
                    next.add(treeNode1);
                }
            }
            list = next;
        }
        return treeNode;
    }
}
