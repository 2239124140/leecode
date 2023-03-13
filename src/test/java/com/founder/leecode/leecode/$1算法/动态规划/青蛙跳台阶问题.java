package com.founder.leecode.leecode.$1算法.动态规划;

public class 青蛙跳台阶问题 {
    //一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
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
}
