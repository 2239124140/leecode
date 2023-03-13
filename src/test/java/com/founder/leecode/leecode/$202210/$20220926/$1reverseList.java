package com.founder.leecode.leecode.$202210.$20220926;

import java.util.ArrayList;
import java.util.List;

public class $1reverseList {

    public static class ListNode {
        Integer val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public  static  ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        List<Integer> valList = new ArrayList<>();
        while (head!=null){
            valList.add(head.val);
            head =head.next;
        }
        head = new ListNode(valList.get(valList.size()-1));
        ListNode  cur = new ListNode(valList.get(valList.size()-2));
        head.next = cur;
        for (int i = valList.size()-3; i >-1; i--) {
            ListNode  next = new ListNode(valList.get(i));
            cur.next = next;
            cur = next;
        }
        return head;
    }


    public  static  ListNode reverseListMax(ListNode head) {
       ListNode prev = null;
       ListNode curr = head;
       while (curr!=null){
           ListNode next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       }
        return prev;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        ListNode head =  new ListNode(nums[0]);
        ListNode cur = new ListNode(nums[1]);
        head.next = cur;
        for (int i = 2; i < nums.length; i++) {
            ListNode  next = new ListNode(nums[i]);
            cur.next = next;
            cur = next;
        }

        ListNode listNode = reverseListMax(head);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode =listNode.next;
        }
    }

}
