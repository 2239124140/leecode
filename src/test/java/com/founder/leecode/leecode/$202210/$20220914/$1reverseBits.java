package com.founder.leecode.leecode.$202210.$20220914;

public class $1reverseBits {
    public static long reverseBits(long n) {
        String nStr = getReverIntStr(n);
        int length1 = nStr.length();
        if(length1>32){
            nStr =   nStr.substring(0,32);
        }else{
            String nStrNew ="";
            for (int i = 0; i < 32-length1; i++) {
                nStrNew+="0";
            }
            nStr=nStr+ nStrNew;
        }
        int length = nStr.length();
        long numberCount = 2;
        long result =nStr.charAt( length-1)-'0';
        for (int i = length-2; i >-1; i--) {
            result = result+(nStr.charAt(i)-'0')*numberCount;
            numberCount = numberCount*2;
        }

        return result;

    }
    public static String getReverIntStr(long n){
        long next = n/2;
        long cur = n%2;
        String result = String.valueOf(cur);
        if(next == 0){
            return result;
        }
        result += getReverIntStr(next);
        return result;
    }

    public static int getReverIntStr1(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            int i1 = n & 1;
            int i2 = i1 << (31 - i);
            rev |=i2 ;
            n >>>= 1;
        }
        return rev;
    }


    public static void main(String[] args) {
        //   System.out.println(getReverIntStr(  1879048192 ));
        // System.out.println(getReverIntStr(1879048192));
        //(01110000000000000000000000000000)
     //  System.out.println(reverseBits1(4294967293L));
      // System.out.println(getReverIntStr(4294967293L));
        //int i = Integer.parseUnsignedInt(3,10);
       // System.out.println(getReverIntStr1(i));
    }
}
