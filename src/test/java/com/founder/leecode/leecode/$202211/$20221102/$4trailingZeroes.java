package com.founder.leecode.leecode.$202211.$20221102;

public class $4trailingZeroes {


    public static int trailingZeroes(int n) {
        int count = 0;
        for (int i = 5; i <= n; i += 5) {
            for (int x = i; x % 5 == 0; x /= 5) {
                ++count;
            }
        }
        return count;

    }

//    private static int trailingZeroes(int start, int end) {
//        if(start>=end){
//            return start;
//        }
//        int mid = (start+end)/2;
//        int i = trailingZeroes(start, mid);
//        int i1 = trailingZeroes(mid + 1, end);
//        System.out.println(i +" * "+i1 +" = "+i*i1 );
//        return i*i1;
//    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(13));

    }
}
