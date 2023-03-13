package com.founder.leecode.leecode.$202210.$;

import java.util.*;

public class $4groupAnagrams {


    public static List<List<String>> groupAnagrams(String[] strs) {
       if(strs==null||strs.length==0){
           return null;
       }
       Map<String,List<String>> map =new HashMap<>();
       for (String str : strs) {
           String strKey = getStrKey(str);
           List<String> strings = map.get(strKey);
           if(strings==null||strings.size()==0){
               strings = new ArrayList<String>();
           }
           strings.add(str);
           map.put(strKey,strings);
        }
        List<List<String>> result = new ArrayList();
        for (List<String> value : map.values()) {
            result.add(value);
        }
        return result;
    }

    public static String getStrKey(String strs) {
        int[] numArray = new int[strs.length()];
        for (int i = 0; i < strs.length(); i++) {
            int i1 = strs.charAt(i) - 'a'+10;
            numArray[i] = i1;
        }
        Arrays.sort(numArray);
        String result = "";
        for (int i : numArray) {
            result+=i;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(strs);
        for (List<String> list : lists) {
            System.out.println(list);
        }

    }
}
