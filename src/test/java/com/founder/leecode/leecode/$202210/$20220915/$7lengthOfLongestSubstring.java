package com.founder.leecode.leecode.$202210.$20220915;

public class $7lengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int maxCount = 0;
        String subStr = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(subStr.contains(String.valueOf(c))){
                int length = subStr.length();
                if(length>maxCount){
                    maxCount = length;
                }
                subStr = subStr.substring(subStr.indexOf(c)+1);
            }
            subStr+=c;
        }
        int length = subStr.length();
        if(length>maxCount){
            maxCount = length;
        }
        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(
                lengthOfLongestSubstring("aabaab!bb")
        );
    }
}
