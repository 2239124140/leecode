package com.founder.leecode.leecode.$202210.$20220913;

public class $12titleToNumbertitleToNumber {
    public static int titleToNumber(String columnTitle) {
        int baseCount = 26 ;
        int result =columnTitle.charAt(columnTitle.length() - 1)  - 'A'+1;
        for (int i = columnTitle.length()-2; i >-1; i--) {
            result+= ( columnTitle.charAt(i) - 'A'+1)*baseCount;
            baseCount = baseCount *26;
        }
        return result;
    }



    public static void main(String[] args) {

        int i = titleToNumber("FXSHRXW");
//2147483647
        System.out.println(i);


    }
}
