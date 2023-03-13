package com.founder.leecode.leecode.$202211.$20221102;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $6combinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curList = new ArrayList<>();
        combinationSum(candidates,target,result,curList,0);
        return result;
    }

    private static void combinationSum(int[] candidates, int target, List<List<Integer>> result, List<Integer> curList, int index) {
        int length = candidates.length;
        if(index==length){
            return;
        }
        if(target==0){
            result.add(new ArrayList<>(curList));
            return;
        }
        combinationSum(candidates,target,result,curList,index+1);
        int candidate = candidates[index];
        target = target - candidate;
        if(target>=0){
            curList.add(candidate);
            combinationSum(candidates,target,result,curList,index+1);
            curList.remove(curList.size() - 1);
        }
    }



    public static void main(String[] args) {

      int[]  candidates = {2,3,6,7};
      int target = 7;
        List<List<Integer>> lists = combinationSum(candidates, target);

        for (List<Integer> list : lists) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
}
