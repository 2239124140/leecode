package com.founder.leecode.leecode.$202212.$20221206;

public class $5minArray {

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
        System.out.println(minArray(new int[]{3,1,3,3}));

    }
}
