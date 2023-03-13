package com.founder.leecode.leecode.$202210.$;

public class $5maxSubArray {


    public static int maxSubArray(int[] nums) {
        int count = nums[0];
        int afterCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            afterCount = Math.max(afterCount+num,num);
            count = Math.max(afterCount,count);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums));

    }
}
