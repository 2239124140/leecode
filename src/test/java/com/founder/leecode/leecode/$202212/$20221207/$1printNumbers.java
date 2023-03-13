package com.founder.leecode.leecode.$202212.$20221207;

public class $1printNumbers {


    public static int[] printNumbers(int n) {
        int max  = 1;
        for (int i = 0; i < n; i++) {
            max = n*max*10;
        }
       int[] result =  new int[max-1];
       for (int i = 1; i < max; i++) {
           result[i] =i;
       }

       return result;

    }

    public static void main(String[] args) {


    }
}
