package com.founder.leecode.leecode.$202302.$20230215;

import java.util.Arrays;
import java.util.Scanner;

public class $8 {


    public static void name(int n) {

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = Integer.parseInt(in.next());
        int len = Integer.parseInt(in.next());
        int[] nums = new  int[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(in.next());
            count+=nums[i];
        }
        int[] copy = new  int[]{1,2,3};
        for (int i = 0; i < len; i++) {
            copy[i] = nums[i];
        }
        if(count<sum){
            System.out.println("[]");
        }

        int index = -1;
        do {
            count = 0;
            for (int i = 0; i < len; i++) {
                int num = nums[i];
                if(num>0){
                    nums[i] = nums[i]-1;
                    count+=nums[i];
                }
            }
            index++;
        }while (sum<count);
        int[] result = new  int[len];
        for (int i = 0; i < len; i++) {
            int num = copy[i];
            if(num<index){
                result[i] = 0 ;
            }else {
                result[i] = num-index ;
            }
        }
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            System.out.print(result[i]);
            if(i!=len-1){
                System.out.print(",");
            }
        }
        System.out.print("]");

        System.out.println(Arrays.toString(result));
    }
}
