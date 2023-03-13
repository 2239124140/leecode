package com.founder.leecode.leecode.$202302.$20230226;

public class $1lengthOfLongestSubstring {



    public static  int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            int[] ints = new int[26];
            int count = 0;
            for (int j = i; j < length; j++) {
                char c = s.charAt(j);
                if(ints[c-'a']==0){
                    ints[c-'a'] = 1;
                    count++;
                }else {
                    break;
                }
            }
            result = Math.max(result,count);
        }

        return result;
    }

    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("abcabcbb");
        System.out.println(result);
    }
}
