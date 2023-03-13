package com.founder.leecode.leecode.$202210.$20220913;

public class $3longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        String str1 = strs[0];
        if(strs.length==1){
            return str1;
        }
        for (int i = 0; i < 200; i++) {
            int length = str1.length()-1;
            if( length<i){
                return result;
            }
            Character curChar = str1.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                String str = strs[j];
                int strlength = str.length()-1;
                if(strlength<i){
                    return result;
                }
                if(curChar!=str.charAt(i)){
                    return result;
                }
            }
            result+=curChar;
        }
        return result;
    }



    public static String longestCommonPrefix2(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        return longestCommonPrefixFen(strs,0,strs.length-1);
    }

    private static String longestCommonPrefixFen(String[] strs, int start, int end) {
        if(start==end){
            return strs[start];
        }
        int i = (start + end) / 2;
        String s = longestCommonPrefixFen(strs, start, i);
        String s1 = longestCommonPrefixFen(strs, i+1, end);
        return longestCommonPrefixCom(s,s1);
    }

    private static String longestCommonPrefixCom(String s, String s1) {
        int min = Math.min(s.length(), s1.length());
        for (int i = 0; i < min; i++) {
            if(s.charAt(i)!=s1.charAt(i)){
                return s.substring(0,i);
            }
        }
        return s.substring(0,min);
    }


    public static void main(String[] args) {
        String[] strs = {"ab","a"};
        System.out.println(longestCommonPrefix2(strs));
    }
}
