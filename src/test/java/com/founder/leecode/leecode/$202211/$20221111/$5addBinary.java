package com.founder.leecode.leecode.$202211.$20221111;

public class $5addBinary {


    public static String addBinary(String a, String b) {
       return null;
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        StringBuffer result = new StringBuffer();
        int lengthA = a.length();
        int lengthB = b.length();
        int count = 0;
        while (lengthA!=0&&lengthB!=0){

            int numA = a.charAt(--lengthA)-'0';
            int numB = b.charAt(--lengthB)-'0';
            int i = numA + numB + count;


        }


    }
}
