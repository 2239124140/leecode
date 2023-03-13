package com.founder.leecode.sort;

import java.util.Arrays;
import java.util.Objects;

/**
 * 选择排序
 */
public class Selection {
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
        for (int i = 0; i < array.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if(!greater(array[minIndex],array[j])){
                    minIndex = j;
                }
            }
            if(!Objects.equals(minIndex,i)){
                exch(array,i,minIndex);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = {4, 5, 6, 3, 2, 1};
        sort(array);
        System.out.println(Arrays.toString(array));
    }


}
