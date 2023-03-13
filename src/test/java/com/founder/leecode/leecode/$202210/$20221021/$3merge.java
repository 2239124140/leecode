//package com.founder.leecode.leecode.$20221021;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class $3merge {
//
//    public static int[][] merge(int[][] intervals) {
//        int[] sort  = new int[intervals.length];
//        for (int i = 0; i < intervals.length; i++) {
//            int[] interval = intervals[i];
//            sort[i] = interval;
//
//        }
//
//
//
//
//
//
//
//    }
//
//    public static int[]  sort(int[][] array){
//        sort(array,0,array.length);
//    }
//
//    private static void sort(int[][] array, int start, int end) {
//        int index = sortIndex(array,start,end);
//        sort(array,start,index);
//        sort(array,index,end);
//
//    }
//
//    private static int sortIndex(int[][] array, int start, int end) {
//        int split = array[start][0];
//        while (end>=start){
//            while (end>=start){
//               int endNum = array[end][0];
//               if(endNum<split){
//                   break;
//               }
//            }
//            while (end>=start){
//                int endNum = array[start][0];
//                if(endNum>split){
//                    break;
//                }
//            }
//            array[]
//
//
//
//
//
//        }
//
//
//
//    }
//
//
//    public static void main(String[] args) {
//
//        int[][]  intervals = {{1,3},{2,6},{8,10},{15,18}};
//        int[][] merge = merge(intervals);
//        for (int[] ints : merge) {
//            System.out.println(Arrays.toString(ints));
//        }
//    }
//}
