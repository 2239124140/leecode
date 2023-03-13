package com.founder.leecode.leecode.$202210.$20220913;

import java.util.HashMap;
import java.util.Map;

public class $0Solution {

    public static int[] solution(int[] nums, int target) {
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
        System.out.println(solution(nums, target));
    }
}
