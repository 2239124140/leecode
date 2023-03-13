package com.founder.leecode.leecode.$202210.$20221009;


public class $1strStr {

    public static int strStr(String haystack, String needle) {
        if(haystack==null||haystack.length()==0||needle==null||needle.length()==0){
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            boolean isMatch = true;
            for (int j = 0; j < needle.length(); j++) {
                if( haystack.charAt(i+j)!= needle.charAt(j)){
                    isMatch =false;
                    break;
                }
            }
            if(isMatch){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        System.out.println(strStr(haystack,needle));

    }
}
