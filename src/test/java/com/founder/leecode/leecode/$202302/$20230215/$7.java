package com.founder.leecode.leecode.$202302.$20230215;

import java.util.Scanner;

public class $7 {

    public static void make1(int row,int len,String[][] nums ) {

       if(row<0||row>nums.length-1){
           return;
       }
       if(len<0||len>nums[0].length-1){
           return;
       }
       if(nums[row][len]=="X"||nums[row][len]=="1"){
           return;
       }
        System.out.println(nums[row][len]);
        System.out.println(nums[row][len]=="O");
       if(nums[row][len].charAt(0)=='O'){
            nums[row][len]="1";
            make1(row-1,len,nums);
            make1(row+1,len,nums);
            make1(row,len-1,nums);
            make1(row,len+1,nums);
       }
    }

    public static  boolean hasMore1(int row,int len,String[][] nums ) {
        int count =0;
        for (int i = 0; i < len; i++) {
          if(nums[0][i]=="1"||nums[row-1][i]=="1"){
              count++;
          }
        }
        for (int j = 1; j < row-1; j++) {
            if(nums[j][0]=="1"||nums[j][len-1]=="1"){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        return false;
    }


    public static  int num(int row,int len,String[][] nums ) {
        int count =0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < len; j++) {
                if(nums[i][j]=="1"){
                    count++;
                }
            }
        }
        return count;
    }

    public static  String[][]  copy(int row,int len,String[][] nums ) {
        String[][] result = new String[row][len];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < len; j++) {
                result[i][j] =nums[i][j];
            }
        }
        return result;
    }




    public static void main(String[] args) {
//        String[][] nums = {
//                {"X","X","X","X"},
//                {"X","O","O","X"},
//                {"X","O","O","X"},
//                {"X","O","X","X"},
//        };
//        int row = 4;
//        int len = 4;
//
        Scanner in = new Scanner(System.in);
        int row = Integer.parseInt(in.next());
        int len = Integer.parseInt(in.next());
        String[][] nums = new   String[row][len];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < len; j++) {
                nums[i][j] =in.next();
            }
        }

        int mixNum = 0;
        int mixCount = 0;
        int returni = 0;
        int returnj = 0;

        for (int i = 0; i < len; i++) {
            String rowFirst = nums[0][i];
            String[][] copy = copy(row,len,nums);
            make1(0,i,copy);
            if(hasMore1(row,len,copy)){
                int num = num(row, len, copy);
                if(num>mixNum){
                    mixNum = num;
                    returni = 0;
                    returnj = i;
                    mixCount = 1;
                }else if(num==mixNum){
                    mixCount++;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            String rowEnd = nums[row - 1][i];
            String[][] copy = copy(row,len,nums);
            make1(row - 1,i,copy);
            if(hasMore1(row,len,copy)){
                int num = num(row, len, copy);
                if(num>mixNum){
                    mixNum = num;
                    returni = row - 1;
                    returnj = i;
                    mixCount = 1;
                }else if(num==mixNum){
                    mixCount++;
                }
            }
        }
        for (int j = 0; j < row; j++) {
            String lenFirst= nums[j][1];
            String[][] copy = copy(row,len,nums);
            make1(j,0,copy);
            if(hasMore1(row,len,copy)){
                int num = num(row, len, copy);
                if(num>mixNum){
                    mixNum = num;
                    returni = j;
                    returnj = 1;
                    mixCount = 1;
                }else if(num==mixNum){
                    mixCount++;
                }
            }
        }
        for (int j = 0; j < row; j++) {
            String lenEnd = nums[j][len-2];
            String[][] copy = copy(row,len,nums);
            make1(j,len-1,copy);
            if(hasMore1(row,len,copy)){
                int num = num(row, len, copy);
                if(num>mixNum){
                    mixNum = num;
                    returni = j;
                    returnj = len-2;
                    mixCount = 1;
                }else if(num==mixNum){
                    mixCount++;
                }
            }
        }

        if(mixCount>1){
            System.out.println(mixNum);
        } else if(mixCount==1){
            System.out.println(returni+" "+returnj+" "+mixNum);
        }else{
            System.out.println("NULL");
        }
    }
}
