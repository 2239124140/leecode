package com.founder.leecode.leecode.$202210.$;

import java.util.ArrayList;
import java.util.List;

public class $2permute {


    public static List<List<Integer>> permute(int[] nums) {
        if(nums==null||nums.length==0){
            return null;
        }
        List<List<Integer>> beforeList = new ArrayList<>();
        List<Integer> beforefirstList = new ArrayList<>();
        beforefirstList.add(nums[0]);
        beforeList.add(beforefirstList);
        for (int i = 1; i < nums.length; i++) {
            List<List<Integer>> curListList = new ArrayList<>();
            int num = nums[i];
            int size = beforeList.get(0).size();
            for (List<Integer> integers : beforeList) {
                for (int j = 0; j <= size; ) {
                    List<Integer> curList = new ArrayList<>();
                    boolean isMatch = false;
                    for (int k = 0; k < integers.size(); ) {
                        if(isMatch){
                            curList.add(integers.get(k));
                            k++;
                            continue;
                        }
                        if(k ==j){
                            curList.add(num);
                            j++;
                            isMatch =true;
                        }else{
                            curList.add(integers.get(k));
                            k++;
                        }
                    }
                    if(!isMatch){
                        curList.add(num);
                        j++;
                    }
                    curListList.add(curList);
                }
            }
            beforeList = curListList;
        }
        return beforeList;
    }

    public static void main(String[] args) {
      int[] nums = {1,2,3};
        List<List<Integer>> permute = permute(nums);
        for (List<Integer> integers : permute) {
            System.out.println(integers.toString());
        }

    }
}
