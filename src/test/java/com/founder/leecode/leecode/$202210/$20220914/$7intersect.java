package com.founder.leecode.leecode.$202210.$20220914;

import java.util.HashMap;
import java.util.Map;

public class $7intersect {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap();
        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] result =new int[length1];
        for (int i = 0; i < nums1.length; i++) {
            int i1 = nums1[i];
            Integer integer = map.get(i1);
            if(integer==null){
                map.put(i1,1);
            }else {
                map.put(i1,++integer);
            }
        }
        int index = 0;
        for (int i = 0; i < nums2.length; i++) {
            int i1 = nums2[i];
            Integer integer = map.get(i1);
            if(integer!=null){
                --integer;
                if(integer<1){
                    map.remove(i1);
                }else{
                    map.put(i1,integer) ;
                }
                result[index] = i1;
                index++;
            }

        }
        int[] result1 =new int[index];
        for (int i = 0; i < index; i++) {
            result1[i] = result[i];

        }
       return result1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] nums = intersect(nums1,nums2);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
