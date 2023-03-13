package com.founder.leecode.leecode.$202212.$20221206;

public class $3fib {


    public static int fib(int n) {
        int[] result = {0,1};
        if(n==0||n==1){
            return n;
        }
        for (int i = 2; i <= n; i++) {
            int before = result[0];
            result[0] = result[1];
            result[1] = before+ result[0];
        }
        return  result[1];
    }

    public static void main(String[] args) {
        int fib = fib(5);
        System.out.println(fib);

    }
}
