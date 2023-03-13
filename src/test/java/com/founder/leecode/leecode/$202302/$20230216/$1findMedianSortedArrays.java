package com.founder.leecode.leecode.$202302.$20230216;
//寻找两个正序数组的中位数
public class $1findMedianSortedArrays {

   public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int comutLength = nums1.length + nums2.length;
       int nums1Length = nums1.length;
       int nums2Length = nums2.length;
       boolean isTwoMid = comutLength % 2 ==0;
       int midIndex = comutLength / 2;
       int nums1Index = 0 ;
       int nums2Index = 0 ;
       int curNum = 0 ;
       if(isTwoMid){
           midIndex--;
       }
       for (int i = 0; i <= midIndex; i++) {
           if(nums1Length>nums1Index&&nums2Length>nums2Index){
               if(nums1[nums1Index]>nums2[nums2Index]){
                   curNum = nums2[nums2Index];
                   nums2Index++;
               }else {
                   curNum = nums1[nums1Index];
                   nums1Index++;
               }
           }else if(nums1Length>nums1Index){
               curNum =  nums1[nums2Index];
               nums1Index++;
           }else if(nums2Length>nums2Index){
               curNum =  nums2[nums2Index];
               nums2Index++;
           }
       }
       int nextNum =0;
       if(isTwoMid){
           if(nums1Length>nums1Index&&nums2Length>nums2Index){
               if(nums1[nums1Index]>nums2[nums2Index]){
                   nextNum = nums2[nums2Index];
               }else {
                   nextNum = nums1[nums1Index];
               }
           }else if(nums1Length>nums1Index){
               nextNum =  nums1[nums1Index];
           }else if(nums2Length>nums2Index){
               nextNum =  nums2[nums2Index];
           }
           return (double)(curNum+nextNum)/2;
       }

       return curNum;
   }


    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {1,2,3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
