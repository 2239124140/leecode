package com.founder.leecode.leecode.$202211.$20221115;

import com.founder.leecode.leecode.$1BaseDO.ListNode;

public class $1deleteDuplicates {


    public static ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;
        ListNode cur =head;
        while (cur!=null&&cur.next!=null){
          if(cur.val==cur.next.val){
              cur.next = cur.next.next;
          }else {
              cur = cur.next;
          }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] head = {1,1,2};
        ListNode listNode = deleteDuplicates(ListNode
                .init(head));
        ListNode.toString(listNode);


    }
}
