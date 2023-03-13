package com.founder.leecode.leecode.$202210.$20220913;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class $4isValid {
    public  static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>() ;
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(map.values().contains(c)){
                stack.push(c) ;
                continue;
            }
            if(map.containsKey(c)){
                Character pop = null;
                try {
                    pop = stack.pop();
                } catch (Exception e) {
                    return false;
                }
                Character character = map.get(c);
                if(!pop.equals(character)){
                    return false;
                }
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
       String s = "]";
        System.out.println(isValid(s));
    }
}
