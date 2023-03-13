package com.founder.leecode.leecode.$1算法.动态规划;

/**
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 */
public class 斐波那契数列 {

    public static int fib(int n) {
        int[] result = {0,1};
        if(n==0||n==1){
            return n;
        }
        final int MOD = 1000000007;
        for (int i = 2; i <= n; i++) {
            int current = (result[0]+result[1])% MOD;
            result[0] = result[1];
            result[1] = current;
        }
        return  result[1];
    }

    public static void main(String[] args) {
        int fib = fib(5);
        System.out.println(fib);

    }
}
