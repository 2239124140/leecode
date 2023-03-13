package com.founder.leecode.leecode.$202302.$20230215;

import java.util.*;

public class $3 {


    public static void name(int n) {

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        Set<Integer> set  = new HashSet<>();
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            set.add(a);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < 1001; i++) {
            if(set.contains(i)){
                result.add(i);
            }
        }
        for (Integer s : result) {
            System.out.println(s);
        }

    }
}
