package com.founder.leecode.leecode.$202210.$20221021;

public class $2canJump {


    public static boolean canJump(int[] nums) {
        int endIndex = nums.length-1;
        int arrayMaxIndex = nums[endIndex]+endIndex;
        if(endIndex==0){
            return true;
        }
        int maxIndex = nums[0];
        if(maxIndex==0){
            return false;
        }
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if(num==0){
                if(maxIndex>i+num){
                    continue;
                }else {
                    break;
                }
            }
            maxIndex = Math.max(i+num,maxIndex);
        }
        if(maxIndex>=arrayMaxIndex){return true;}



        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};

        System.out.println(canJump(nums));


    }
}
