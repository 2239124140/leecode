package com.founder.leecode.leecode.$202211.$20221102;

import java.util.Arrays;

public class $2threeSumClosest {


    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        int result  = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int start = i+1;
            int end = length-1;

            while (start<end){
                int cur =  num + nums[start]+ nums[end];
                if(cur == target){
                    return cur;
                }
                if(Math.abs(result-target)>Math.abs(cur-target)){
                    result = cur;
                }
                if(cur<target){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[]  nums = {-1,2,1,4};
        int target = 1;

        System.out.println(
                threeSumClosest(nums,target)
        );

    }
}
