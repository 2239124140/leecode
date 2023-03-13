package com.founder.leecode.leecode.$202211.$20221111;

public class $3searchInsert {


    public static int searchInsert(int[] nums, int target) {
        if(target<nums[0]){
            return 0;
        }
        if(target>nums[nums.length-1]){
            return nums.length;
        }
        return searchInsert(nums,0 ,nums.length-1,target);
    }

    private static int searchInsert(int[] nums, int start, int end, int target) {
        if(start>=end){
            return start;
        }
        int mid = (start+end)/2;
        int midNum = nums[mid];
        if(midNum==target){
            return mid;
        }
        if(midNum>target){
            return searchInsert(nums,start,mid,target);
        }else {
            return searchInsert(nums,mid+1,end,target);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int val = 5;
        int i = searchInsert(nums, val);
        System.out.println(i);

    }
}
