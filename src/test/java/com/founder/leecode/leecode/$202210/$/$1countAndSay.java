package com.founder.leecode.leecode.$202210.$;

public class $1countAndSay {

    public static String countAndSay(int n) {
        if(n<1){
            return null;
        }
        String beforeStr= "1";
        for (int i = 2; i <= n; i++) {
            String curStr = "";
            char curChar = beforeStr.charAt(0);
            int number = 1;
            for (int j = 1; j < beforeStr.length(); j++) {
               if(curChar==beforeStr.charAt(j)){
                   number++;
               }else {
                   curStr = curStr+number+curChar;
                   number =1;
                   curChar = beforeStr.charAt(j);
               }
            }
            curStr = curStr+number+curChar;
            beforeStr = curStr;
            System.out.println(beforeStr);
        }

        return beforeStr;
    }

    public static void main(String[] args) {

        System.out.println(countAndSay(3));
    }
}
