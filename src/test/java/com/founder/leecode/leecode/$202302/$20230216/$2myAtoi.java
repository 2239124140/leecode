package com.founder.leecode.leecode.$202302.$20230216;

public class $2myAtoi {





    public static int myAtoi(String s) {
        boolean isplus=true;
        boolean isInit = false;
        boolean zeroContinue = true;
        String numStr="";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c==' '){
                continue;
            }
            if(c=='0'){
                if(zeroContinue){
                    isInit  = true;
                    continue;
                }
            }
            if(isInit&&(c=='-'||c=='+')){
                break;
            }
            if(c=='-'){
                isInit = true;
                isplus = false;
                continue;
            }else if(c=='+'){
                isInit = true;
                isplus = true;
                continue;
            }
            if(c>='0'&&c<='9'){
                zeroContinue = false;
                numStr+=c;
            }else {
              break;
            }
        }
        if(numStr.length()==0){
            return 0;
        }

        if(numStr.length()>8){
            if(isplus){
                return Integer.MAX_VALUE;
            }else {
                return Integer.MIN_VALUE;
            }
        }
        if(isplus){
            return Integer.parseInt(numStr);
        }else {
            return -Integer.parseInt(numStr);
        }

    }

    public static void main(String[] args) {
        String s = "+1";
        System.out.println(myAtoi(s));

    }
}
