package com.founder.leecode.leecode.$202211.$20221111;

public class $1isPalindrome {


    public static boolean isPalindrome(int n) {
        if(n<0){
            return false;
        }
        if(n<9){
            return true;
        }
        String s = String.valueOf(n);
        int start= 0;
        int end= s.length()-1;
        while (start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {


    }
}
