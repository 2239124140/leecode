package com.founder.leecode.leecode.$202210.$20220914;

public class $4missingNumber {

    public static  int missingNumber(int[] nums) {
        int[] nums1 = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            nums1[nums[i]]=1;
        }
        for (int i = 0; i < nums1.length; i++) {
            if(nums1[i]==0){
                return i;
            }
        }

        return nums.length+1;

    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}
