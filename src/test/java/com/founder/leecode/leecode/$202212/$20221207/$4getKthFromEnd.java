package com.founder.leecode.leecode.$202212.$20221207;

import com.founder.leecode.leecode.$1BaseDO.ListNode;

public class $4getKthFromEnd {


    public static ListNode getKthFromEnd1(ListNode head, int k) {
        int kthFromEnd = getKthFromEnd(head);
        int kthFromStart =  kthFromEnd - k;
        for (int j = 0; j < kthFromStart; j++) {
            head = head.next;
        }
        return head;
    }

    private static int getKthFromEnd(ListNode head) {
        if(head==null){
            return 0;
        }
        return 1+getKthFromEnd(head.next);
    }


    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;

        }
        while (fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {

        ListNode kthFromEnd = getKthFromEnd(ListNode.init(new int[]{1, 2, 3, 4, 5}), 3);
        ListNode.toString(kthFromEnd);
    }
}
