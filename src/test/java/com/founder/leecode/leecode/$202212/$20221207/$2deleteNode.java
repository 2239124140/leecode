package com.founder.leecode.leecode.$202212.$20221207;

import com.founder.leecode.leecode.$1BaseDO.ListNode;

public class $2deleteNode {


    public ListNode deleteNode(ListNode head, int val) {
        ListNode result = head;
        if(head.val == val){
            result = head.next;
            head.next=null;
            return result;
        }

        while (head.next!=null){
            if(head.next.val == val){
                head.next=head.next.next;
                return result;
            }
            head  = head.next;
        }
        return result;
    }

    public static void main(String[] args) {


    }
}
