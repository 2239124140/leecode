package com.founder.leecode.leecode.$202211.$20221101;

public class $2longestPalindrome {


    public static String longestlongestPalindrome(String s) {
        int length = s.length();
        String result = s.substring(0,1);
        for (int i = 0; i < length-1 ; i++) {
            String curStr =  s.substring(i,i+1);
            for (int j = 1; j <=  length-i ; j++) {
                String substring = s.substring(i, i + j);
                if(islongestPalindrome(substring)){
                    curStr =substring;
                    if(curStr.length()>result.length()){
                        result = curStr;
                    }
                }
            }

        }
        return result;
    }
    public static boolean islongestPalindrome(String s) {
        int startIndex = 0;
        int endIndex = s.length()-1;
        while (startIndex<endIndex){
            if(s.charAt(startIndex)!=s.charAt(endIndex)){
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;

    }

    public static void main(String[] args) {

        String s = "babad";

        System.out.println(longestlongestPalindrome(s));
    }
}
