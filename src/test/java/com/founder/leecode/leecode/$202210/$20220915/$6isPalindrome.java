package com.founder.leecode.leecode.$202210.$20220915;

public class $6isPalindrome {
    public static boolean isPalindrome(String s) {
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if((c>='A'&&c<='Z')){
              c = (char) (c -'A'+'a');
            }
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9')){
                newStr+= c;
            }
        }

        int indexStart = 0;
        int indexEnd = newStr.length()-1;
        while (indexStart<indexEnd){
          if(  newStr.charAt(indexStart++)!=newStr.charAt(indexEnd--)){
              return false;
          }
        }
        return true;


    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("ABC"));
    }
}
