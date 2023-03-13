package com.founder.leecode.leecode.$202210.$20220915;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class $1firstUniqChar {
    public static int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                Integer integer = map.get(c);
                map.put(c,++integer) ;
            }else{
                map.put(c,1) ;
            }
        }

        for (int i = 0; i < s.length(); i++) {
           if( map.get(s.charAt(i))==1){
               return i;
           }
        }

        return -1;
    }

    static class Pair {
        char ch;
        int pos;

        Pair(char ch, int pos) {
            this.ch = ch;
            this.pos = pos;
        }
    }


    public static int firstUniqChar1(String s) {
        Map<Character, Integer> position = new HashMap<Character, Integer>();
        Queue<Pair> queue = new LinkedList<Pair>();
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            char ch = s.charAt(i);
            if (!position.containsKey(ch)) {
                position.put(ch, i);
                queue.offer(new Pair(ch, i));
            } else {
                position.put(ch, -1);
                while (!queue.isEmpty() && position.get(queue.peek().ch) == -1) {
                    queue.poll();
                }
            }
        }
        return queue.isEmpty() ? -1 : queue.poll().pos;
    }


    public static void main(String[] args) {
        System.out.println(firstUniqChar1("loveleetcode"));
    }
}
