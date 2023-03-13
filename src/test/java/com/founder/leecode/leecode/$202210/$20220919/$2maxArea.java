package com.founder.leecode.leecode.$202210.$20220919;

public class $2maxArea {
    public static int maxArea(int[] height) {


       int startIndex = 1;
       int endIndex = height.length;
       if(endIndex==1){
           return height[startIndex-1];
       }
       int result =0;
       while (startIndex<endIndex){
           int startNum = height[startIndex - 1];
           int endNum = height[endIndex - 1];
           if(startNum>endNum){
               int count = endNum*(endIndex-startIndex);
               if(count>result){
                   result =count;
               }
               endIndex--;
           }else{
               int count = startNum*(endIndex-startIndex);
               if(count>result){
                   result =count;
               }
               startIndex++;
           }
       }
       return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }

}
