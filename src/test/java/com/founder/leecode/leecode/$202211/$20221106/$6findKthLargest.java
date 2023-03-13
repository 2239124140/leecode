package com.founder.leecode.leecode.$202211.$20221106;

import java.util.Arrays;

public class $6findKthLargest {


    public static int findKthLargest(int[] nums, int k) {
       int result =  sort(nums,0,nums.length-1,nums.length-k);
       return result;
    }

    private static int sort(int[] nums, int start, int end,int k) {
        if(start>=end){
            if(start==k){
                return nums[start];
            }
            return -1;
        }
        int index = index(nums, start, end);
        if(index == k){
            return nums[index];
        }

        if(k>index){
            return sort(nums, index + 1, end, k);
        }else {
            return sort(nums, start, index - 1, k);
        }

    }



    private static int index(int[] arr, int start, int end) {
        Integer midNum = arr[start];
        int left = start;
        int right = end+1;
        while (true){

            while (arr[ --right]>midNum){
                if(right==start){
                    break;
                }
            }

            while (arr[++left]<midNum){
                if(left==end){
                    break;
                }
            }
            if(left>=right){
                break;
            }
            int curNum = arr[left];
            arr[left] = arr[right];
            arr[right] = curNum;
        }

        arr[start] =  arr[right];
        arr[right]= midNum;
        System.out.println("start:"+start+" mid:"+right+" end:"+end );
        System.out.println("arr:"+ Arrays.toString(arr));
        return right;

    }

    public static void main(String[] args) {
        // int[] nums= {3,2,3,1,2,4,5,5,6};
        //int  k = 4;

      //  int[] nums= {3,2,1,5,6,4};
        int[] nums= {3,1,2,4};
        int  k = 2;
        int kthLargest = findKthLargest(nums, k);
        System.out.println(kthLargest);
    }
}
