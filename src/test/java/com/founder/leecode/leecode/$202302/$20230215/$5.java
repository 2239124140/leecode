package com.founder.leecode.leecode.$202302.$20230215;

import java.util.Scanner;

public class $5 {


    public static void name(int n) {

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String substring = str.substring(2);
        int length = substring.length()-1;
        int result=0;
        for (int i = 0; i < substring.length(); i++) {
            char c = substring.charAt(i);
            int num=0 ;
            if(c>='0'&&c<='9') {
                num = c - '0';
            }
            if(c>='A'&&c<='F') {
                num = c - 'A' +10;
            }
            for (int j = 0; j < length; j++) {
                num=  num*16;
            }
            result+=num;
            length--;
        }
        System.out.println(result);
    }
}
