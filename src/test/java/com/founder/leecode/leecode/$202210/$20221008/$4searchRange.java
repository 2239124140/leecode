package com.founder.leecode.leecode.$202210.$20221008;


public class $4searchRange {

    public static int[] searchRange(int[] nums, int target) {
        int[] ints = new int[]{-1,-1};
        if(nums==null||nums.length==0){
            return ints;
        }
        if(nums.length==1){
            if(nums[0]==target){
                return new int[]{0,0};
            }else{
                return ints;
            }
        }
        int i = searchRange(nums, 0, nums.length-1, target);
        int length = nums.length;
        int endIndex = i;
        int startIndex = i;
        for (int j = i; j < length; j++) {
            if(nums[j]!=target){
                break;
            }
            endIndex =  j;
        }
        for (int j = i; j >0; j--) {
            if(nums[j]!=target){
                break;
            }
            startIndex =  j;
        }
        ints[0]=startIndex;
        ints[1]=endIndex;
        return ints;
    }

    private static int searchRange(int[] nums, int start, int end, int target) {
        if(start>end){
            return -1;
        }
        int mid = (start + end) / 2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[start]==target){
            return start;
        }
        if(nums[end]==target){
            return end;
        }
        if(nums[start]>target){
          return   -1;
        }
        if(nums[end]<target){
            return   -1;
        }

        if(nums[start]<target&&nums[mid]>target){
            return   searchRange(nums, start, mid, target);
        }
        if(nums[mid]<target&&nums[end]>target){
            return   searchRange(nums, mid+1, end, target);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,4};
        int target = 4;
        int[] ints = searchRange(nums, target);
        for (int string : ints) {
            System.out.println(string);
        }

    }
}
