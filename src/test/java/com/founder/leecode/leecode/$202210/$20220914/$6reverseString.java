package com.founder.leecode.leecode.$202210.$20220914;

public class $6reverseString {


    public static void reverseString(char[] nums) {
        int indexStart = 0;
        int indexEnd = nums.length-1;
        while (indexStart<indexEnd){
            char temp = nums[indexStart];
            nums[indexStart]= nums[indexEnd];
            nums[indexEnd]= temp;
            indexStart++;
            indexEnd--;
        }


    }
    public static void main(String[] args) {
        char[] nums = {'h','e','l','l','o'};

        for (int i = 0; i < nums.length; i++) {

            System.out.println(nums[i]);
        }

    }
}
