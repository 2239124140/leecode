package com.founder.leecode.leecode.$202211.$20221106;

import java.util.Arrays;

public class $3QuickSort {


    public static void sort( Integer[] arr) {

         sort(arr,0,arr.length-1);

    }

    private static void sort(Integer[] arr, int start, int end) {
        if(start>=end){
            return;
        }
        int index = index(arr,start,end);
        sort(arr,start,index-1);
        sort(arr,index+1,end);
    }

    private static int index(Integer[] arr, int start, int end) {
        Integer midNum = arr[start];
        int left = start+1;
        int right = end;
        while (left!=right){
            if(arr[right]>midNum){
                right--;
                continue;
            }
            if(arr[left]<midNum){
                left++;
                continue;
            }

            int curNum = arr[left];
            arr[left] = arr[right];
            arr[right] = curNum;
        }

        arr[start] =  arr[right];
        arr[right]= midNum;
        System.out.println("start:"+start+" mid:"+right+" end:"+end );
        System.out.println("arr:"+Arrays.toString(arr));
        return right;

    }

    public static void main(String[] args) {
        Integer[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 8};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
