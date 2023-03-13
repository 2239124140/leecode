package com.founder.leecode.leecode.$202211.$20221101;

public class $5convert {


    public static String convert(String s, int numRows) {
        if(s.length()==1||s.length()<numRows){
            return s;
        }
        StringBuffer[] result = new StringBuffer[numRows];
        for (int i = 0; i < numRows; ++i) {
            result[i] = new StringBuffer();
        }
        int curRows = 0;
        boolean isAdd = true;
        for (int i = 0; i < s.length(); i++) {
            StringBuffer stringBuffer = result[curRows];
            stringBuffer.append(s.charAt(i));
            if(curRows==0){
              if(!isAdd){
                  isAdd = !isAdd;
              }
            }
            if(curRows==numRows-1){
                isAdd = !isAdd;
            }
            if(isAdd){
                curRows++;
            }else{
                --curRows;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            stringBuffer.append(result[i]);
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String  s = "PAYPALISHIRING";
                int numRows = 4;
        System.out.println(
                convert(s,numRows)
        );
    }
}
