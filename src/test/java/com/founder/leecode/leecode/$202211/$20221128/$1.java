package com.founder.leecode.leecode.$202211.$20221128;

import com.founder.leecode.leecode.$1BaseDO.ListNode;

public class $1 {


    public static int[] reversePrint(ListNode head) {
        ListNode reverse = reverse(head);
        ListNode.toString(reverse);
       return null;
    }

    private static ListNode reverse(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode reverse = reverse(head.next);
        ListNode next = head.next;
        head.next = null;
        next.next = head;
        return reverse;
    }

    public static void main(String[] args) {
        int[] array = {1,3,2};
        reversePrint(ListNode.init(array));

    }
}
