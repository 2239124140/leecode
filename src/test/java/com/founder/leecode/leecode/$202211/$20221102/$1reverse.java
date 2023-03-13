package com.founder.leecode.leecode.$202211.$20221102;

public class $1reverse {


    public static int reverse(int x) {
      if(x>Integer.MAX_VALUE||x<Integer.MIN_VALUE){
          return 0;
      }
      int result = 0;
      while (x!=0){
          int mid = x%10;
          x=x/10;;
          result = result*10+mid;
      }
      return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234));

    }
}
