package com.founder.leecode.leecode.$202211.$20221111;

public class $4lengthOfLastWord {


    public static int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length()-1; i >-1; i--) {

            if(s.charAt(i)==' '){
                if(count==0){
                    continue;
                }
                break;
             }
             count++;
        }
        return count;


    }

    public static void main(String[] args) {
        String s = "a";
        System.out.println(lengthOfLastWord(s));

    }
}
