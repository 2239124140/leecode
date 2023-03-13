package com.founder.leecode.leecode.$202210.$20220919;

import java.util.Arrays;

public class $1singleNumber {

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i+1 < nums.length; i=i+2) {
            int num = nums[i];
            if(num!=nums[i+1]){
                return num;
            }
        }
        return nums[nums.length-1];
    }


    public static int singleNumber1(int[] nums) {
        int ans = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                ans = ans ^ nums[i];
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber1(nums));
    }
}
