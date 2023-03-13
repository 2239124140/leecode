package com.founder.leecode.leecode.$202211.$20221103;

import com.founder.leecode.leecode.$1BaseDO.ListNode;

public class $5rotateRight {


    public static ListNode rotateRight(ListNode head, int k) {
       ListNode first = head;
        int length  = 0;
        while (head!=null){
           length++;
           if(head.next==null){
               head.next = first;
               break;
           }
            head = head.next;
        }
        k = k%length;
        ListNode end = null;
        for (int i = 0; i < length-k; i++) {
            end = first;
            first = first.next;
        }
        end.next =null ;
        return first;
    }

    public static void main(String[] args) {

       int[] head = {1,2,3,4,5};
       int k = 2;
        ListNode listNode = rotateRight(ListNode.init(head), k);
        ListNode.toString(listNode);

    }
}
