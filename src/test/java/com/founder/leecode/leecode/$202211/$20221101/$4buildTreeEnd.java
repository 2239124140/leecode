package com.founder.leecode.leecode.$202211.$20221101;

import com.founder.leecode.leecode.$1BaseDO.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class $4buildTreeEnd {


    public static Map<Integer,Integer> inorderTreeMap =  new HashMap<>();

    private static TreeNode buildTree(int[] preorder, int preorderStart, int preorderEnd,int inorderIndex) {
        if(preorderStart>preorderEnd){
            return null;
        }
        TreeNode root = new TreeNode();
        int num = preorder[preorderEnd];
        root.val = num ;
        Integer numIndex = inorderTreeMap.get(num);
        Integer length =   numIndex-inorderIndex;
        root.left=buildTree(preorder,preorderStart,preorderStart-length,inorderIndex);
        root.right = buildTree(preorder,preorderStart+length+1,preorderEnd-1,numIndex+1);
        return root;
    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            inorderTreeMap.put( inorder[i],i);
        }
        int length = postorder.length;
        return buildTree(postorder,0,length-1,0);
    }

    public static void main(String[] args) {
        int[] postorder = {9,15,7,20,3};
        int[] inorder = {9,3,15,20,7} ;
        TreeNode treeNode = buildTree( inorder,postorder);
        TreeNode.toString(treeNode);


    }
}
