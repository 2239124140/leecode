package com.founder.leecode.leecode.$202210.$20220921;


import java.util.ArrayList;
import java.util.List;

public class $4hasCycle {
    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public static boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode slow = head;
        ListNode quick = head;
        while (head!=null){
             if(slow==null){
                 return false;
             }
             slow = slow.next;
             if(quick.next==null){
                return false;
             }
             if(quick.next.next==null){
                return false;
             }
            quick = quick.next.next;
             if(slow == quick){
                 return true;
             }
         }
         return false;
    }


    public static void main(String[] args) {
        int[] nums = {3,2,0,-4};
        int pos = 1;
        List<ListNode> list =new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            ListNode listNode = new ListNode(num);
            list.add(listNode);
        }
        for (int i = 0; i < nums.length; i++) {
            if(i==nums.length-1){
                list.get(nums.length-1).next  =  list.get(pos);
                break;
            }
            list.get(i).next = list.get(i+1);
        }
        System.out.println(hasCycle(list.get(0)));
    }
}
