package com.founder.leecode.leecode.$202211.$20221101;

import com.founder.leecode.leecode.$1BaseDO.ListNode;

public class $1addTwoNumbers {


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode next = result;
        int beforeNum  = 0 ;
        while (l1!=null||l2!=null){
            int l1Num  = 0 ;
            int l2Num  = 0 ;
            if(l1!=null){
                l1Num = l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                l2Num = l2.val;
                l2 = l2.next;
             }
            int count =   beforeNum+l1Num+l2Num;
            beforeNum = count/10;
            int nodeNum = count%10;
            ListNode listNode = new ListNode(nodeNum);
            next.next = listNode;
            next = listNode;
        }
        if(beforeNum>0){
            ListNode listNode = new ListNode(beforeNum);
            next.next = listNode;
        }
        return  result.next;

    }

    public static void main(String[] args) {
        int[] l1 = {2,4,3};
        int[] l2 = {5,6,4};
        ListNode listNode = addTwoNumbers(ListNode.init(l1), ListNode.init(l2));
        ListNode.toString(listNode);

    }
}
