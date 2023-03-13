package com.founder.leecode.leecode.$202211.$20221104;

import com.founder.leecode.leecode.$1BaseDO.ListNode;

public class $4deleteDuplicates {
    public  static ListNode deleteDuplicates(ListNode head) {

        ListNode newHead = null;
        ListNode result = null;
        if(head==null||head.next==null){
            return head;
        }


        ListNode curListNode = null;
        int count = 0;
        while (head!=null){
            if(count==0){
                curListNode = head;
                head = head.next;
                curListNode.next = null;
                count++;
            }
            if(head == null){
                break;
            }
            if(curListNode.val == head.val){
                curListNode = head;
                head = head.next;
                curListNode.next = null;
                count++;
                continue;
            }else {
                if(count ==1){
                    if(result==null){
                        result = curListNode;
                        newHead = curListNode;
                    }else{
                        newHead.next =curListNode;
                        newHead = newHead.next;
                    }
                }
                count = 0;
            }
        }
        if(count==1){
            if(result==null){
                result = curListNode;
            }else{
                newHead.next =curListNode;
            }
        }
        return result;
    }

    public static void main(String[] args) {
      int[]  head = {1};

        ListNode listNode = deleteDuplicates(ListNode.init(head));
        ListNode.toString(listNode);
    }
}
