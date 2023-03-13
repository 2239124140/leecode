package com.founder.leecode.sort;

import java.util.Arrays;

/**
 * 插入
 */
public class Insertion {
    private static boolean greater(Comparable m,Comparable n){
        if(m.compareTo(n)>0){
            return true;
        }
        return false;
    }
    private static void exch(Comparable[] array,int i ,int j){
        Comparable k= array[i];
        array[i]=  array[j];
        array[j]=  k;
    }
    private static void sortStart(Integer[] array) {
        for (int i = 1; i < array.length; i++) {
            int curValue = array[i];
            int curIndex = i;
            for (int j = i; j >0; j--) {
                if(greater(array[j],curValue)){
                    curIndex = j;
                }
            }
            if(curIndex == i){
                continue;
            }
            for (int k = i; k > curIndex; k--) {
                exch(array,k,k-1);
            }
            array[curIndex] = curValue;
        }
    }


    public static void sortEnd(Comparable[] a){
        for (int i=1;i<a.length;i++){
            //当前元素为a[i],依次和i前面的元素比较，找到一个小于等于a[i]的元素
            for (int j=i;j>0;j--){
                if (greater(a[j-1],a[j])){
                    //交换元素
                    exch(a,j-1,j);
                }else {
                    //找到了该元素，结束
                    break;
                }
            }}
    }

    public static void main(String[] args) {
        Integer[] array = {4, 5, 6, 3, 2, 1};
        sortStart(array);
        System.out.println(Arrays.toString(array));
    }


}
