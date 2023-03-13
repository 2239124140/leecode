package com.founder.leecode.leecode.$202210.$20220913;

public class $9climbStairs {

    public static int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int beforeResult = 1;
        int curResult = 2;
        int temp;
        for (int i = 3; i <= n; i++) {
            temp = beforeResult+curResult;
            beforeResult =curResult;
            curResult =temp;
        }
        return curResult;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
