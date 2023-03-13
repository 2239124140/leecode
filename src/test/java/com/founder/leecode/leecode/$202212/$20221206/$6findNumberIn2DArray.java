package com.founder.leecode.leecode.$202212.$20221206;

public class $6findNumberIn2DArray {

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if( matrix.length==0||matrix[0].length==0){
            return false;
        }
        int hang = matrix.length-1;
        int lie = matrix[0].length-1;
        int x = 0;
        int y = lie;
        while (x<=hang&&y>=0){
            if(target<matrix[x][y]){
                y--;
            }else if(target>matrix[x][y]){
                x++ ;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                      {1,   4,  7, 11, 15},
                      {2,   5,  8, 12, 19},
                      {3,   6,  9, 16, 22},
                      {10, 13, 14, 17, 24},
                      {18, 21, 23, 26, 30}
                    };


    }
}
