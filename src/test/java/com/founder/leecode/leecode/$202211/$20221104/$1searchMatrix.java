package com.founder.leecode.leecode.$202211.$20221104;

public class $1searchMatrix {


    public static boolean searchMatrix(int[][] matrix, int target) {
        int[] targetArray = null;
        for (int[] ints : matrix) {
            int anInt = ints[0];
            int anInt1 = ints[ints.length - 1];
            if(target>anInt&&target<anInt1 ){
                targetArray= ints;
                break;
            }
        }
        if(targetArray==null){
            return false;
        }
        return  searchMatrix2(targetArray,target);


    }

    private static boolean searchMatrix2(int[] targetArray, int target) {
        return searchMatrix2(targetArray,target,0,targetArray.length-1);

    }

    private static boolean searchMatrix2(int[] targetArray, int target, int start, int end) {
        if(start>end){
            return false;
        }

        int mid = (start + end) / 2;

        int startnum = targetArray[start];
        int midnum = targetArray[mid];
        int endnum = targetArray[end];
        if(midnum==target||startnum==target||endnum==target){
            return true;
        }

        if(start==end){
            return false;
        }

        if(midnum>target){
            return searchMatrix2(targetArray,target,start,mid);
        }else {
            return  searchMatrix2(targetArray,target,mid+1,end);
        }
    }

    public static void main(String[] args) {
       //int[][] matrix = {{1,4,5,7},{10,11,16,20},{23,30,34,60}};4

       int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
       //int[][] matrix = {{1,4,5,7},{10,11,16,20},{23,30,34,60}};
       int target = 3;
        boolean b = searchMatrix(matrix, target);
        System.out.println(b);
    }
}
