package com.founder.leecode.leecode.$202210.$20220914;

public class $5moveZeroes {


    public static void moveZeroes(int[] nums) {
        int indexZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                if(indexZero!=i){
                    nums[indexZero]= nums[i];
                    nums[i] = 0;
                }
                indexZero++;
            }

        }







    }
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            System.out.println(num);
        }

    }
}
