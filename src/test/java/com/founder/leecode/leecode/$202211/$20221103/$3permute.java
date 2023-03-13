package com.founder.leecode.leecode.$202211.$20221103;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class $3permute {


    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            curList.add(num);
        }

        permute(nums.length,result,curList,0);
        return result;

    }

    private static void permute(int length, List<List<Integer>> result, List<Integer> curList, int first) {
        if(first==length){
            result.add(new ArrayList<>(curList));
        }
        for (int i = first; i < length; i++) {
            System.out.println("交换前：curList" + Arrays.toString(curList.toArray()));
            Collections.swap(curList,first,i);
            System.out.println("交换后：curList" + Arrays.toString(curList.toArray()));
            permute(length,result,curList,first+1);
            System.out.println("回溯前：curList" + Arrays.toString(curList.toArray()));
            Collections.swap(curList,first,i);
            System.out.println("回溯后：curList" + Arrays.toString(curList.toArray()));
        }

    }

    public static void main(String[] args) {
        int[] nums= {1,2,3};
        List<List<Integer>> permute = permute(nums);
        for (List<Integer> integers : permute) {
            System.out.println( Arrays.toString(integers.toArray()));
        }
    }
}
