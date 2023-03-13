package com.founder.leecode.leecode.$202210.$20220913;

public class $11majorityElement {

    public  static  int majorityElement(int[] nums) {
        int count = 1 ;
        int max =  nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if(num!=max){
                if(count==0){
                    max = num;
                    count = 1;
                }else{
                    count--;
                }
            }else{
                count++;
            }
        }
        return max;



    }



    public static void main(String[] args) {
        int[]  nums = {6,5,5};
        int i = majorityElement(nums);
          System.out.println(i);


    }
}
