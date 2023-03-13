package com.founder.leecode.leecode.$202210.$20220915;

import java.util.ArrayList;
import java.util.List;

public class $2fizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            boolean is3 = (i % 3) == 0;
            boolean is5 = (i % 5) == 0;
            if(is3&&is5){
                result.add("FizzBuzz");
                continue;
            }
            if(is3){
                result.add("Fizz");
                continue;
            }
            if(is5){
                result.add("Buzz");
                continue;
            }
            result.add(String.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> list = fizzBuzz(15);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
