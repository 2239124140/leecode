package com.founder.leecode.leecode.$202210.$20220913;

public class $2romanToInt {
    public static int romanToInt(String s) {
        int length = s.length();
        int num = getValue(s.charAt(length-1));
        for (int i = length-1; i >0; i--) {
            char curChar = s.charAt(i);
            char beforeChar = s.charAt(i-1);
            Integer curNumIndex = getValue(curChar);
            Integer beforeNumIndex = getValue(beforeChar);
            if(beforeNumIndex<curNumIndex){
                num -=beforeNumIndex;
            }else{
                num +=beforeNumIndex;
            }
        }
        return num;
    }

    public static  int getValue(Character character){
        switch (character){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }

    public static void main(String[] args) {
        String string = "XII";
        System.out.println(romanToInt(string));
    }
}
