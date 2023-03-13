package com.founder.leecode.leecode.$202211.$20221106;

import java.util.Arrays;

public class $4MergeSort {
    public static  Integer[] copy ;

    public static void sort(Integer[] arr) {
        copy = new Integer[arr.length];
        sort(arr,0,arr.length-1);

    }

    private static void sort(Integer[] arr, int start, int end) {
        if(start>=end){
            return;
        }
        int mid = (start + end) / 2;
        sort(arr,start,mid);
        sort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    private static void merge(Integer[] arr, int start, int mid, int end) {
        int start1=start;
        int end1=mid;
        int start2=mid+1;
        int end2=end;
        int index = start;
        while (start1<=end1&&start2<=end2){
            if(arr[start1]<arr[start2]){
                copy[index++] = arr[start1++];
            }else{
                copy[index++] = arr[start2++];
            }
        }

        if(start1<=end1){
            for (int i = start1; i <= end1; i++) {
                copy[index++]  = arr[i];

            }
        }
        if(start2<=end2){
            for (int i = start2; i <= end2; i++) {
                copy[index++] = arr[i];
            }
        }
        for (int i = start; i <= end; i++) {
            arr[i] = copy[i];
        }
        System.out.println("start:"+start+" mid:"+mid+" end:"+end );
        System.out.println("arr:"+Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Integer[] arr = {8, 4, 5, 7, 1, 3, 6, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
