package com.founder.leecode.leecode.$202210.$20220917;

import java.util.HashSet;
import java.util.Set;

public class $1longestPalindrome {

    public static String longestPalindrome(String s) {
        int length = s.length();
        for (int i = length; i >0; i--) {
            for (int j = 0; j <= length-i; j++) {
            String substring = s.substring(j, j + i);
            String rever = rever(substring);
                if(rever.equals(substring)){
                    return substring;
                }
            }
        }
        return null;
    }
    public static String longestPalindrome1(String s) {
        Set<Character> zimuSet = new HashSet();
        zimuSet.add('1');
        zimuSet.add('2');
        zimuSet.add('3');
        zimuSet.add('4');
        zimuSet.add('5');
        zimuSet.add('6');
        zimuSet.add('7');
        zimuSet.add('8');
        zimuSet.add('9');
        for (char i = 'a'; i <= 'z'; i++) {
            zimuSet.add(i);
        }
        String result = "";
        for (Character character : zimuSet) {
            int startIndex = s.indexOf(character);
            if(startIndex<0){
                break;
            }
            int lastIndexOf = s.lastIndexOf(character );
            String subString = s.substring(startIndex,lastIndexOf+1);
            if(subString.equals(rever(subString))){
                if(subString.length()>result.length()){
                    result = subString;
                }
            }

            while (true){
                int start1Index = s.indexOf(character,startIndex+1);
                String subString1 = s.substring(start1Index,lastIndexOf+1);
                if(subString1.equals(rever(subString1))){
                    if(subString1.length()>result.length()){
                        result = subString1;
                    }
                }
                String subStringNoLast = s.substring(startIndex,lastIndexOf);
                int last2IndexOf = subStringNoLast.lastIndexOf(character );
                String subString2 = s.substring(startIndex,last2IndexOf+1);
                if(subString2.equals(rever(subString2))){
                    if(subString2.length()>subString2.length()){
                        result = subString2;
                    }
                }
            }




        }
        return result;
    }


    public  static String rever(String s){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = s.length()-1; i >-1; i--) {
            stringBuffer.append(s.charAt(i));
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome1("ac"));
    }
}
