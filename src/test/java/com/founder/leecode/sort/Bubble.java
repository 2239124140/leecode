package com.founder.leecode.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class Bubble {
    private static boolean greater(Comparable m,Comparable n){
        if(m.compareTo(n)>0){
            return true;
        }
        return false;
    }
    private static void exch(Integer[] array,int i ,int j){
        int k= array[i];
        array[i]=  array[j];
        array[j]=  k;
    }
    private static void sort(Integer[] array) {
        for (int i = array.length-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if(greater(array[j],array[j+1])){
                    exch(array,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = {4, 5, 6, 3, 2, 1};
        Bubble.sort(array);
        System.out.println(Arrays.toString(array));
    }


}
