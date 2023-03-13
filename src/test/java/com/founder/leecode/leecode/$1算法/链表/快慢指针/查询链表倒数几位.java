package com.founder.leecode.leecode.$1算法.链表.快慢指针;

import com.founder.leecode.leecode.$1BaseDO.ListNode;

public class 查询链表倒数几位 {
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
