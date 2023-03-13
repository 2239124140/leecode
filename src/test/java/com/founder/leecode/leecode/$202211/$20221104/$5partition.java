package com.founder.leecode.leecode.$202211.$20221104;

import com.founder.leecode.leecode.$1BaseDO.ListNode;

public class $5partition {

    public static ListNode partition(ListNode head, int x) {

        ListNode small = new ListNode(0,null);
        ListNode large = new ListNode(0,null);
        ListNode smallHead =small;
        ListNode largeHead =large;
        while (head!=null){
            ListNode cur = head;
            head = head.next;
            cur.next =null;
            if(cur.val<x){
                smallHead.next = cur;
                smallHead = smallHead.next;
            }else {
                largeHead.next = cur;
                largeHead = largeHead.next;
            }
        }
        if(small.next==null){
            return large.next;
        }
        smallHead.next = large.next;
        return small.next;
    }

    public static void main(String[] args) {

       int[]  head = {1,4,3,2,5,2};
       int  x = 3;
        ListNode partition = partition(ListNode.init(head), x);
        ListNode.toString(partition);
    }
}
