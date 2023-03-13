package com.founder.leecode.leecode.$202210.$20220921;


import java.util.ArrayList;
import java.util.List;

public class $3generate {


    public static  List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer>  firstList = new ArrayList<>();
        firstList.add(1);
        result.add(firstList);
        if(numRows==1){
            return result;
        }
        List<Integer>  sencodList = new ArrayList<>();
        sencodList.add(1);
        sencodList.add(1);
        result.add(sencodList);
        List<Integer>  rowList = sencodList;
        for (int i = 3; i <= numRows; i++) {
            List<Integer>  threeList = new ArrayList<>();
            threeList.add(1);
            for (int j = 0; j < rowList.size()-1; j++) {
                threeList.add(rowList.get(j)+rowList.get(j+1));
            }
            threeList.add(1);
            result.add(threeList);
            rowList = threeList;
        }
        return result;
    }


    public static void main(String[] args) {
        List<List<Integer>> lists = generate(5);
        for (List<Integer> list : lists) {
            System.out.print("[");
            for (Integer integer : list) {
                System.out.print(integer);
            }
            System.out.print("]");
            System.out.println();
        }

    }
}
