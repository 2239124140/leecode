package com.founder.leecode.leecode.$202211.$20221104;

import java.util.Arrays;

public class $2sortColors {


    public static void sortColors(int[] nums) {
      int startIndex =0 ;
      int endIndex = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            while (endIndex>i&& nums[i]==2){
                int num1 = nums[endIndex];
                nums[endIndex--] = 2;
                nums[i] = num1;
            }

            int num = nums[i];
            if(num==0){
                int num1 = nums[startIndex];
                nums[startIndex++] = num;
                nums[i] = num1;
            }
        }

    }

    public static void main(String[] args) {

        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
