package com.founder.leecode.leecode.$202210.$20220913;

public class $6removeDuplicates {
    public static int removeDuplicates(int[] nums) {
       int startIndex = 1;
        int beforeNum = nums[0];
       for (int i = 1; i < nums.length; i++) {
           int curNum = nums[i];
           if(curNum!=beforeNum){
               nums[startIndex] = curNum;
               startIndex++;
               beforeNum = curNum;
           }
       }
       return startIndex;
    }

    public static void main(String[] args) {
        int[] strs = {1,1,2};
        int i = removeDuplicates(strs);
        System.out.println(i);

    }
}
