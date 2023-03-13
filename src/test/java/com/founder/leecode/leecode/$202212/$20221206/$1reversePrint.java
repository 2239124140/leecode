package com.founder.leecode.leecode.$202212.$20221206;

import com.founder.leecode.leecode.$1BaseDO.ListNode;

public class $1reversePrint {

    public static int[] reversePrint(ListNode head) {
        ListNode listNode =  reverse(head);
        ListNode next = listNode;
        int n = 0;
        while(next!=null){
            n++;
            next = next.next;
        }
        int i = 0;
        int[] result = new int[n];
        while(listNode!=null){
            result[i] = listNode.val;
            listNode =listNode.next;
        }
        return result;
    }

    public static ListNode reverse(ListNode head) {
        ListNode  pre =  null;
        ListNode  curr =  head;
        while (curr!=null){
            ListNode next= curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public static ListNode reverse1(ListNode curr) {
        if(curr.next==null){
            return curr;
        }
        ListNode newNode = reverse1( curr.next);
        curr.next.next = curr;
        curr.next = null;
        return newNode;
    }


    public static void main(String[] args) {
        int[] arrry = {1,2,3};

        int[] ints = reversePrint(ListNode.init(arrry));
        System.out.println(ints);


    }
}
