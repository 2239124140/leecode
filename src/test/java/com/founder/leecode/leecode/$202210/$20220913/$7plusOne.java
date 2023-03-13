package com.founder.leecode.leecode.$202210.$20220913;

import java.util.Arrays;

public class $7plusOne {

    public static  int[] plusOne(int[] digits) {
        int length = digits.length;
        boolean isAdd = true;
        for (int digit : digits) {
            if(digit!=9){
                isAdd =false;
                break;
            }
        }
        if(isAdd){
           int[] result =  new int[length+1];
            result[0] = 1;
            for (int i = 1; i < result.length; i++) {
                result[i] =0;
            }
            return result;
        }
        plusArrayOne(digits,length-1,length-2);
        return digits;
    }

    private static void plusArrayOne(int[] digits, int cur, int before) {
        if(cur==0){
            digits[cur] = digits[cur]+1;
            return;
        }
        int number = digits[cur];
        if(number == 9 ){
            digits[cur] = 0;
            plusArrayOne(digits,before,before-1);
        }else{
            digits[cur] = digits[cur]+1;
            return;
        }


    }

    public static void main(String[] args) {
        int[] strs = {0};
        int[] i = plusOne(strs);
        System.out.println(Arrays.toString(i));

    }
}
