package com.founder.leecode.leecode.$202211.$20221105;

import java.util.HashSet;
import java.util.Set;

public class $1longestConsecutive {


    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int result = 0 ;
        int numLength = 0;
        for (Integer num : set) {
            if(set.contains(num-1)){
                continue;
            }
            int curNum = num;
            while (set.contains(curNum)){
                curNum ++;
                numLength++;
            }
            result = Math.max(result,numLength);
            numLength = 0;

        }
        return result;

    }

    public static void main(String[] args) {

        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
