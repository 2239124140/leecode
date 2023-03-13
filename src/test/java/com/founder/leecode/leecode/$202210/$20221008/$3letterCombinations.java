package com.founder.leecode.leecode.$202210.$20221008;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $3letterCombinations {

    public static List<String> generateParenthesis(String digits) {
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        int length = digits.length();
        List<String> list = new ArrayList<>();
        List<String> result = new ArrayList<>();
        if(digits==null||digits.length()==0){
            return list;
        }
        if(list.size()==0){
            String s = phoneMap.get(digits.charAt(0));
            for (int j = 0; j < s.length(); j++) {
                list.add(String.valueOf(s.charAt(j)));
            }
        }
        for (int i = 1; i <length; i++) {
            String s1 = phoneMap.get(digits.charAt(i));
            for (int j = 0; j < list.size(); j++) {
                for (int k = 0; k < s1.length(); k++) {
                    result.add(list.get(j)+s1.charAt(k));
                }
            }
            list = result;
            result = new ArrayList<>();
        }
        return list;
    }

    public static void main(String[] args) {
        String n = "234";
        List<String> strings = generateParenthesis(n);
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
