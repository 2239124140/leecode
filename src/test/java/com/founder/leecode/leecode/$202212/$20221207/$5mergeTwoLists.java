package com.founder.leecode.leecode.$202212.$20221207;

import com.founder.leecode.leecode.$1BaseDO.ListNode;

public class $5mergeTwoLists {


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode next  = head;
        while (l1!=null&&l2!=null){
            int val = l1.val;
            int val1 = l2.val;
            if(val<val1){
                ListNode cur  = l1;
                l1 = l1.next;
                cur.next = null;
                next.next = cur;
                next = next.next;
            }else {
                ListNode cur  = l2;
                l2 = l2.next;
                cur.next = null;
                next.next = cur;
                next = next.next;
            }
        }
        if(l1!=null){
            next.next = l1;
        }
        if(l2!=null){
            next.next = l2;
        }
        return head.next;
    }
    public static void main(String[] args) {
        ListNode listNode = mergeTwoLists(ListNode.init(new int[]{1, 2, 4}), ListNode.init(new int[]{1, 3, 4}));
        ListNode.toString(listNode);

    }
}
