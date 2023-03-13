package com.founder.leecode.leecode.$1算法.数组;

public class 查找旋转数组 {
    public static int minArray(int[] numbers) {
        int start = 0;
        int end = numbers.length-1;
        while (start<end){
            int mid = (start+end)/2;
            if(numbers[mid]>numbers[end]){
                start = mid+1;
            }else if(numbers[mid]<numbers[end]){
                end = mid;
            }else {
                end--;
            }
        }
        return numbers[end];
    }



    public static void main(String[] args) {
        System.out.println(minArray(new int[]{2,2,2,3,3,3,1,1,1}));

    }
}
