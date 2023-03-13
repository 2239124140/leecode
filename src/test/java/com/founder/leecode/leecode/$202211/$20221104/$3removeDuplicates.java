package com.founder.leecode.leecode.$202211.$20221104;

public class $3removeDuplicates {

    public static int removeDuplicates(int[] nums) {
        int curNum = nums[0];
        int count = 1;
        int curIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if(num!=curNum){
                count =1;
                curNum = num;
            }else {
                count++;
                if(count>2){
                    continue;
                }
            }
            nums[curIndex++]=num;
        }
        return curIndex;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int i = removeDuplicates(nums);
        System.out.println(i);


    }
}
