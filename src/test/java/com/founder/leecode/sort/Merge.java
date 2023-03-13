package com.founder.leecode.sort;

import java.util.Arrays;

public class Merge {
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

    private static Comparable[] assist;//归并所需要的辅助数组
    private static void sort(Comparable[] array) {
        assist = new Comparable[array.length];
        int lo = 0;
        int hi = array.length-1;
        sort(array, lo, hi);
    }

    private static void sort(Comparable[] array, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi -lo )/2;
        sort(array,lo,mid );
        sort(array,mid +1,hi);
        //对lo到mid这组数据和mid到hi这组数据进行归并
        merge(array, lo, mid, hi);
    }

    private static void merge(Comparable[] array, int lo, int mid, int hi) {
        int i = lo;//定义一个指针，指向assist数组中开始填充数据的索引
        int index1 = lo;
        int index2 = mid+1;
        while (index1<=mid&&index2<=hi){
            if(greater(array[index1],array[index2])){
                assist[i] = array[index2];
                index2 ++;
            }else{
                assist[i] = array[index1];
                index1 ++;
            }
            i++;
        }
        while(index1<=mid){
            assist[i++]=array[index1++];
        }
        while(index2<=hi){
            assist[i++]=array[index2++];
        }
        //到现在为止，assist数组中，从lo到hi的元素是有序的，再把数据拷贝到a数组中对应的索引处
        for (int index=lo;index<=hi;index++){
            array[index]=assist[index];
        }

    }

    public static void main(String[] args) {
        Comparable[] array = {4, 5, 6, 3, 2, 1};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

//    public static void main(String[] args) {
//        Comparable[] array = {4, 5, 6, 3, 2, 1};
//        //
//        System.out.println(Arrays.toString(assist));
//    }


}
