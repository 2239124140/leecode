package com.founder.leecode.leecode.$202210.$20220913;

public class $10merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        for (int i = nums1.length-1; i >-1 ; i--) {
            if(m<0){
                break;
            }
            if (n<0){
                break;
            }
            int num1 = nums1[m];
            int num2 = nums2[n];

            if(num1>num2){
                nums1[i]=num1;
                m--;
            }else{
                nums1[i]=num2;
                n--;
            }
        }
        if (n>=0){
            for (int i = 0; i <= n; i++) {
                nums1[i]=nums2[i];
            }
        }
    }
    public static void main(String[] args) {

      int[]  nums1 = {1,2,3,0,0,0};
      int  m = 3;
      int[] nums2 = {2,5,6};
      int n = 3;
        merge(nums1,m,nums2,n);
        for (int i = 0; i < nums1.length; i++) {
            int i1 = nums1[i];
            System.out.println(i1);
        }

    }

}
