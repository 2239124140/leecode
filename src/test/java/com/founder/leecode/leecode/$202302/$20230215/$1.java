package com.founder.leecode.leecode.$202302.$20230215;

import java.util.Scanner;

public class $1 {


    public static void name(int n) {

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String next =  in.next();
        while (in.hasNext()) { // 注意 while 处理多个 case
            next =  in.next();
        }
        int count= 0;
        char[] chars = next.toCharArray();
        for (char aChar : chars) {
            if(aChar==' '){
                count= 0;
            }
            count++;
        }
        System.out.println(count);

    }
}
