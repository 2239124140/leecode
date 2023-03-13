package com.founder.leecode.leecode.$202211.$20221103;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class $4merge {


    public static  int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] result = new int[intervals.length+1][2];
        for (int i = 0; i < result.length; i++) {
            if(i==result.length-1){
                result[i] = newInterval;
                break;
            }
            result[i] = intervals[i];

        }
        return  merge(result);
    }

    public  static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        List<int[]> result = new ArrayList<>();
        int[] cur = new int[2];
        cur[0] = intervals[0][0];
        cur[1] = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            int left0 = cur[0];
            int right0 = cur[1];
            int left = interval[0];
            int right = interval[1];
            if(left>right0){
                result.add(new int[]{left0,right0});
                cur[0] = left;
                cur[1] = right;
            }else{
                cur[0] = Math.min(left0,left);
                cur[1] =  Math.max(right0,right);
            }
        }
        result.add(new int[]{cur[0],cur[1]});
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        //int[][]  intervals = {{1,3},{2,6},{8,10},{15,18}};
        //int[][] merge = merge(intervals);
        int[][]  intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[]  newInterval =  {4,8};
        int[][] merge = insert(intervals, newInterval);


        for (int[] ints : merge) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
