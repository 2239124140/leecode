package com.founder.leecode.leecode.$202210.$20220920;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $1threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int startnum = nums[i];
            if(i != 0&&nums[i-1]==startnum){
                continue;
            }
            for (int j = length-1; j > i; j--) {
                int endNum = nums[j];
                if(j != length-1&&nums[j+1]==endNum){
                    continue;
                }
                int target = -(startnum + endNum);
                if(target<startnum||target>endNum){
                    continue;
                }
                for (int k = i+1; k < j; k++) {
                    int num = nums[k];
                    if(num+startnum+endNum==0){
                        List<Integer> resultList = new ArrayList<>();
                        resultList.add(startnum);
                        resultList.add(num);
                        resultList.add(endNum);
                        result.add(resultList);
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        List<List<Integer>> lists = threeSum(nums);
        for (List<Integer> list : lists) {
            System.out.println("[");
            for (Integer integer : list) {
                System.out.print(integer);
            }
            System.out.println("]");
        }

    }
}
