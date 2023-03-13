package com.founder.leecode.leecode.$202211.$20221103;

public class $1multiply {


    public static String multiply(String num1, String num2) {
        if(num1.equals("0")||num1.equals("0")){
            return "0";
        }

        int num1length = num1.length()-1;
        int num2length = num2.length()-1;
        String startNum = num1;
        String endNum = num2;
        if(num1length<num2length){
             startNum = num2;
             endNum = num1;
        }
        String result = "0";
        int count = 0;
        for (int i = endNum.length()-1; i >=0; i--) {
            int number = endNum.charAt(i)-'0';
            String multiplyNum  =  multiplyNum(number,startNum,count);
            count++;
            result =  multiplyAdd(multiplyNum,result);
        }
        return result;
    }

    private static String multiplyAdd(String start, String end) {
        int startlength = start.length()-1;
        int endlength = end.length()-1;
        int max = Math.max(startlength,endlength);
        String result = "";
        int nextNum = 0;
        for (int i = max; i >= 0 ; i--) {
            int i1 = 0;
            if(startlength>=0){
                i1 = start.charAt(startlength--) - '0';
            }
            int i2 = 0 ;
            if(endlength>=0){
                i2 = end.charAt(endlength--) - '0';
            }
            int count  = i1+i2+nextNum;
            nextNum = count/10;
            result =  count%10+result;
        }
        if(nextNum>0){
            result = nextNum+result;
        }
        return result;

    }

    private static String multiplyNum(int number, String startNum, int count) {
        String result = "";
        int nextNum = 0;
        for (int i = startNum.length()-1; i >=0; i--) {
            int number1 = startNum.charAt(i)-'0';
            int i1 = number * number1 +nextNum;
            nextNum = i1/10;
            result =  i1%10+result;
        }
        if(nextNum>0){
            result = nextNum+result;
        }
        for (int i = 0; i < count; i++) {
            result+='0';
        }
        return result;
    }

    public static void main(String[] args) {
        String  num1 = "123";
        String num2 = "456";
        System.out.println(multiply(num1,num2));
        //System.out.println(multiplyAdd("19","81"));
       // System.out.println(multiplyNum(5,"100",1));

    }
}
