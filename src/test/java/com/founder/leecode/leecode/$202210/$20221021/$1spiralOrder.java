package com.founder.leecode.leecode.$202210.$20221021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $1spiralOrder {


    public static List<Integer> spiralOrder(int[][] matrix) {
        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int clumeStart = 0;
        int clumeEnd = matrix[0].length-1;
        List<Integer> result = new ArrayList<>();
        while (rowStart<=rowEnd&&clumeStart<=clumeEnd) {
            for (int i = clumeStart; i <= clumeEnd; i++) {
                result.add(matrix[rowStart][i]);
            }
            for (int i = rowStart + 1; i <= rowEnd; i++) {
                result.add(matrix[i][clumeEnd]);
            }
            if(clumeEnd>clumeStart&&rowEnd>rowStart){
                for (int i = clumeEnd-1; i > clumeStart; i--) {
                    result.add(matrix[rowEnd][i]);
                }
                for (int i = rowEnd ; i > rowStart; i--) {
                    result.add(matrix[i][clumeEnd]);
                }
            }
            rowStart++;
            rowEnd--;
            clumeEnd--;
            clumeStart++;
        }
        return result;
    }

    public static List<Integer> spiralOrder1(int[][] matrix) {
        List<Integer> order = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return order;
        }
        int rows = matrix.length, columns = matrix[0].length;
        int left = 0, right = columns - 1, top = 0, bottom = rows - 1;
        while (left <= right && top <= bottom) {
            for (int column = left; column <= right; column++) {
                order.add(matrix[top][column]);
            }
            for (int row = top + 1; row <= bottom; row++) {
                order.add(matrix[row][right]);
            }
            if (left < right && top < bottom) {
                for (int column = right - 1; column > left; column--) {
                    order.add(matrix[bottom][column]);
                }
                for (int row = bottom; row > top; row--) {
                    order.add(matrix[row][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return order;

    }


    public static void main(String[] args) {
      //  int[][]     matrix = {{1,2,3 },{4,5,6 },{7,8,9 } };
       // int[][]     matrix = {{1,2,3 } };
        int[][]     matrix = {{1},{2},{3}  };
        //int[][]     matrix = {{1,2,3,4 },{5,6,7,8 },{9,10,11,12 } };
       // List<Integer> list = spiralOrder(matrix);
        List<Integer> list = spiralOrder(matrix);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
