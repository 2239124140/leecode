package com.founder.leecode.leecode.$202211.$20221103;

public class $2jump {
    public static int jump(int[] nums) {
        int end = nums.length-1;
        int step=0;
        while (end >0){
            for (int i = 0; i < nums.length; i++) {
                if(i+nums[i]>=end){
                    end =  i;
                    step++;
                    break;
                }
            }
        }
        return step;
    }

    public static int jump1(int[] nums) {
        int max = 0;
        int end = 0;
        int step=0;
        for (int i = 0; i < nums.length-1; i++) {
            max =  Math.max(max,i+nums[i]);
            if(i==end){
                end =  max;
                step++;
            }
        }
        return step;
    }

    public static void main(String[] args) {
        int[]  nums = {2,3,0,1,4};
        System.out.println(jump1(nums));

    }
}
