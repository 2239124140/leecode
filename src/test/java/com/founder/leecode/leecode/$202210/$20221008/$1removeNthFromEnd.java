package com.founder.leecode.leecode.$202210.$20221008;


import com.founder.leecode.leecode.$1BaseDO.ListNode;

public class $1removeNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode root = new ListNode(0,head);
        ListNode curNext = root;
        int i = 0;
        while (head!=null){
            head = head.next;
            if(i<n){
                i++;
            }else{
                curNext = curNext.next;
            }
        }
        curNext.next = curNext.next.next;
        return root.next;
    }

    public static void main(String[] args) {
        int[] head = {1};
                int n = 1;
        ListNode init = ListNode.init(head);

        ListNode listNode = removeNthFromEnd(init, n);
        ListNode.toString(listNode);

    }
}
