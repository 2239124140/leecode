package com.founder.leecode.leecode.$202210.$20220913;

public class $8mySqrt {

    public static int mySqrt(int x) {
        int start = 0;
        int end = x;
        while (true){
            int  mid = (end-start)/2+start;
            if((long)(mid+1)*(mid+1)==x){
                return mid+1;
            }
            if(((long)mid*mid<x &&(long)(mid+1)*(mid+1)>x)||(long)mid*mid==x  ){
                return mid;
            }
            if((long) mid*mid>x){
                end = mid;
            }else{
                start = mid;
            }
        }
    }





    public static void main(String[] args) {
        //System.out.println(mySqrt(1));
        //System.out.println(mySqrt(8));
        //System.out.println(mySqrt(16));
        //System.out.println(mySqrt(17));
        //System.out.println(mySqrt(35));
        System.out.println(mySqrt(2147483647));

    }
}
