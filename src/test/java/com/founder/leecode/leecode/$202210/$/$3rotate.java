package com.founder.leecode.leecode.$202210.$;

public class $3rotate {


    public static void rotate(int[][] matrix) {
        //水平翻转
        for (int i = 0; i < matrix.length/2; i++) {
            int[] ints = matrix[i];
            for (int j = 0; j < ints.length; j++) {
                int matrix1 = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-i-1][j];
                matrix[matrix.length-i-1][j] =matrix1;
            }
        }

      //对角线翻转

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int matrix1 = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] =matrix1;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int[] ints = matrix[i];
            for (int j = 0; j < ints.length; j++) {
                int matrix1 = matrix[i][j];
                System.out.println(matrix1);
            }
        }
    }

    public static void main(String[] args) {
        int[][]  matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for (int[] ints : matrix) {
            System.out.println(ints);
        }

    }
}
