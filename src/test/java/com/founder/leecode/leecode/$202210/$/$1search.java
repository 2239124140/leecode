package com.founder.leecode.leecode.$202210.$;

public class $1search {
    public static  int search(int[] nums, int target) {

        return  search(nums,0,nums.length-1,target);


    }


    public static  int search(int[] nums, int start,int end,int target) {

        if(nums[start]==target){
            return start;
        }
        if(nums[end]==target){
            return end;
        }
        if(start==end){
            if(nums[end]==target){
                return end;
            }else {
                return -1;
            }
        }
        if(start>end){
            return -1;
        }
        int mid = (start+end)/2;
        int midNum = nums[mid];
        int startNum = nums[start];
        int endNum = nums[end];
        if(nums[mid]==target){
            return mid;
        }

        if(startNum>midNum&&startNum>endNum){
            if(target>startNum){
                return  search(nums,start,mid,target);
            }
            if(target<midNum){
                return  search(nums,start,mid,target);
            }
            if(target<endNum){
                return   search(nums,mid+1,end,target);
            }
            return -1;
        }
        if(startNum<midNum&&midNum<endNum){
            if(target>midNum){
                return   search(nums,mid+1,end,target);
            }
            if(target<midNum){
                return  search(nums,start,mid,target);
            }
            return -1;
        }

        if(midNum>startNum&&midNum>endNum){
            if(target>midNum){
                return  search(nums,mid+1,end,target);
            }
            if(target>startNum){
                return  search(nums,start,mid,target);
            }
            if(target<endNum){
                return   search(nums,mid+1,end,target);
            }

            return -1;
        }

        return -1;
    }

    public static void main(String[] args) {
        //int[] nums = {5,1,2,3,4};
        //int[] nums = {4,5,6,7,0,1,2};
        int[] nums = {8,9,2,3,4};
        int target = 9;
        System.out.println(search(nums,target));

    }
}
