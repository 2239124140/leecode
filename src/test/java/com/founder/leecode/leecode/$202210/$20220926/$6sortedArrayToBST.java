package com.founder.leecode.leecode.$202210.$20220926;


import com.founder.leecode.leecode.$1BaseDO.TreeNode;

public class $6sortedArrayToBST {
    public static TreeNode sortedArrayToBST(int[] nums) {
        int leftIndex = 0;
        int rightIndex = nums.length-1;
        TreeNode treeNode = sortedArrayToBST(nums, leftIndex, rightIndex);
        return treeNode;
    }

    private static TreeNode sortedArrayToBST(int[] nums, int leftIndex, int rightIndex) {

        if(leftIndex>rightIndex){
            return null;
        }
        int mid = (rightIndex + leftIndex) / 2;
        TreeNode root = new TreeNode( nums[mid]);
        root.left = sortedArrayToBST(nums, leftIndex, mid-1);
        root.right = sortedArrayToBST(nums, mid+1, rightIndex);
        return root;
    }


    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};

        sortedArrayToBST(nums);

    }
}
