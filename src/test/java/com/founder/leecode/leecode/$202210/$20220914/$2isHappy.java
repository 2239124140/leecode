package com.founder.leecode.leecode.$202210.$20220914;

import java.util.HashSet;
import java.util.Set;

public class $2isHappy {

    public static boolean isHappy(int n) {
        String numStr = String.valueOf(n);

        Set<Integer> set = new HashSet<>();
        do{
            int nextResult = 0 ;
            for (int i = 0 ;i < numStr.length(); i++) {
                nextResult+= (numStr.charAt(i)-'0')*(numStr.charAt(i)-'0');
            }
            numStr = String.valueOf(nextResult);
            if(nextResult==1){
                return true;
            }
            if(set.contains(nextResult)){
                return false;
            }
            set.add(nextResult);
            if(nextResult==n){
                return false;
            }
        }while (true);


    }


    public static int getNext(int n){
        String numStr = String.valueOf(n);
        int nextResult = 0 ;
        for (int i = 0 ;i < numStr.length(); i++) {
            nextResult+= (numStr.charAt(i)-'0')*(numStr.charAt(i)-'0');
        }
        return nextResult;
    }

    public static boolean isHappy2(int n) {
        int slowRunner  = n;
        int fastRunner   = getNext(n);
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }

    public static void main(String[] args) {

        System.out.println(isHappy(2));
    }
}
