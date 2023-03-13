package com.founder.leecode.leecode.$202210.$20220917;

import java.util.ArrayList;
import java.util.List;

public class $3permute {


    public  static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int num : nums) {
            List<List<Integer>> curList = new ArrayList<>();
            for (List<Integer> integers : result) {
                
                ArrayList<Integer> integers1 = new ArrayList<>();
                integers1.addAll(integers);
                integers1.add(num);
                curList.add(integers1);
            }
            result.addAll(curList);
        }
        return result;

    }



    public static void main(String[] args) {
        int[]  nums = {1,2,3};
        List<List<Integer>> subsets = permute(nums);
        for (List<Integer> subset : subsets) {
            for (Integer integer : subset) {
                System.out.println(integer);
            }
        }
    }
}
