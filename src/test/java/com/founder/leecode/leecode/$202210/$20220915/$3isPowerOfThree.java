package com.founder.leecode.leecode.$202210.$20220915;

public class $3isPowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if(n<3){
            return false;
        }
        if(n==3){
            return true;
        }
        if(n%3!=0){
            return false;
        }
        return isPowerOfThree(n/3);
    }



    public static void main(String[] args) {
        System.out.println(isPowerOfThree(1));
    }
}
