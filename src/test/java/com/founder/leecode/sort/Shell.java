package com.founder.leecode.sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class Shell {
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

    private static Integer getH(Integer[] array){
        return array.length/2+1;
    }
    private static void sort(Integer[] array) {
        Integer h = getH(array);
        for(;h>0;h= h/2){
            for (int i = h; i < array.length; i++) {
                for (int j = i; j >=h; j=j-h) {
                   if(greater(array[j-h],array[j])){
                       exch(array,j,j-h);
                   }
                }

            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = {4, 5, 6, 3, 2, 1};
        sort(array);
        System.out.println(Arrays.toString(array));
    }


}
