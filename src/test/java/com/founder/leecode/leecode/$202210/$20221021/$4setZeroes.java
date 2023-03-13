package com.founder.leecode.leecode.$202210.$20221021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $4setZeroes {

    public static void setZeroes(int[][] matrix) {
        List<Integer> rowZeroeList = new ArrayList();
        List<Integer> clumeZeroeList = new ArrayList();
        int clume  = 0 ;
        for (int[] ints : matrix) {
            for (int i = 0; i < ints.length; i++) {
                int anInt = ints[i];
                if(anInt==0){
                    rowZeroeList.add(clume);
                    clumeZeroeList.add(i );
                }
            }
            clume++;
        }
        for (Integer integer : clumeZeroeList) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][integer] = 0 ;
            }
        }
        for (Integer rowZeroe : rowZeroeList) {
            for (int i = 0; i < matrix[rowZeroe].length; i++) {
                matrix[rowZeroe][i] = 0 ;
            }
        }

    }

    public static void main(String[] args) {

        //int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }

    }
}
