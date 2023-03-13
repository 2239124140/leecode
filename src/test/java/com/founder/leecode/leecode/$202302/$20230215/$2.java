package com.founder.leecode.leecode.$202302.$20230215;

import java.util.Scanner;

public class $2 {


    public static void name(int n) {

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        char c1 = s2.charAt(0);
        char c2 = 0;
        int i = 'z' - 'Z';
        if('z'>=c1&&c1>='a'){
            c2 = (char)( c1 - i);
        }else if('Z'>=c1&&c1>='A'){
            c2 = (char)( c1 + i);
        }
        int count = 0;
        for (int j = 0; j < s1.length(); j++) {
            char c = s1.charAt(j);
            if(c==c1||c==c2){
                count++;
            }
        }
        System.out.println(count);
    }
}
