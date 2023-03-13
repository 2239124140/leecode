package com.founder.leecode.leecode.$202210.$20220913;

import java.util.*;

public class $1twoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int legth = nums.length;
        int startIndex = 0 ;
        for(int i = startIndex;startIndex< nums.length;i++){
            int endIndex = legth -1;
            for(int j = endIndex;j>i;j --){
                int curNum = nums[j] ;
                int startnum = nums[i] ;
                if(startnum+curNum ==target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }


    public static int[] twoSumMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i],i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = {-3,4,3,90};
        int target = 0;
        int[] ints = twoSumMap(nums, target);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);

        }

    }

}
