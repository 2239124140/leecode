package com.founder.leecode.leecode.$202212.$20221207;

import java.util.Arrays;

public class $3exchange {


    public static int[] exchange(int[] nums) {
       int start = 0;
       int end = nums.length-1;
       while (start<end){
           while (nums[start]%2==1){
               start++;
               if(start>end){
                 break;
               }
           }
           while (nums[end]%2==0){
               end--;
               if(start>end){
                   break;
               }
           }
           if(start>end){
               break;
           }
           int endNum = nums[end];
           nums[end] = nums[start];
           nums[start] = endNum;
       }
       return nums;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,4};

        int[] exchange = exchange(nums);
        System.out.println(Arrays.toString(exchange));
    }
}
