package com.founder.leecode.leecode.$202211.$20221111;

import java.util.Arrays;

public class $2removeElement {


    public static int removeElement(int[] nums, int val) {
        int length = nums.length;

        int end = length;
        int count = length;
        for (int i = 0; i < end; i++) {
            int num = nums[i];
            if(num==val){
                count--;
                nums[i]=nums[end-1];
                i--;
                end--;
            }
        }
      return count;

    }

    public static void main(String[] args) {
       int[] nums = {1};
               int val = 1;
        int i = removeElement(nums, val);
        System.out.println(i);
        System.out.println(Arrays.toString(nums));

    }
}
