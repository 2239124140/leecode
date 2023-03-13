package com.founder.leecode.leecode.$202302.$20230215;

import java.util.*;

public class $4 {


    public static void name(int n) {

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
       while (str.length()>0){
           String strCur;
            if(str.length()<8){
                strCur = str;
                for (int j = 0; j < 8-str.length(); j++) {
                    strCur+="0";
                }
                str="";
            }else{
                strCur = str.substring(0, 8);
                str = str.substring(8);
            }
            System.out.println(strCur);

        }


    }
}
