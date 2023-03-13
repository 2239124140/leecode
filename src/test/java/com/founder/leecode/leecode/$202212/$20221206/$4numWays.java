package com.founder.leecode.leecode.$202212.$20221206;

public class $4numWays {
    public static int numWays(int n) {
        if(n==0){
            return 1;
        }
        if(n==1||n==2){
            return n;
        }
        final int MOD = 1000000007;
        int[] result = {1,2};
        for (int i = 3; i <= n; i++) {
            int current = (result[0]+result[1])% MOD;
            result[0] = result[1];
            result[1] = current;
        }
        return  result[1];
    }

    public static void main(String[] args) {

        System.out.println(numWays(7));
    }
}
