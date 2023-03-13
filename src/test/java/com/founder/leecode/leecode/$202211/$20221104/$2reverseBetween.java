package com.founder.leecode.leecode.$202211.$20221104;

import com.founder.leecode.leecode.$1BaseDO.ListNode;

public class $2reverseBetween {


    public  static ListNode  reverseBetween(ListNode head, int left, int right) {
        ListNode startNode =  new ListNode(0,null);
        ListNode startNodeHead= startNode;
        ListNode startNodeEnd= null;
        ListNode endNode =  new ListNode(0,null);
        ListNode endNodeHead= endNode;
        ListNode betNode =  new ListNode(0,null);
        ListNode betNodeHead= betNode;
        int count = 0;
        while (head!=null){
            ListNode   curNode  = head;
            head = head.next;
            curNode.next =null;
            count++;
           if(count<left){
               startNode.next = curNode;
               startNodeEnd = curNode;
               startNode =startNode.next;
           } else if(count>right){
               endNode.next = curNode;
               endNode =endNode.next;
           }else{
               betNode.next = curNode;
               betNode =betNode.next;
           }
        }

        startNodeHead= startNodeHead.next;
        ListNode betNodeHeadEnd = betNodeHead.next;
        ListNode  betReverseNode =  reverseListNode(betNodeHead.next);
        endNodeHead= endNodeHead.next;
        ListNode result = new ListNode(0,null);
        ListNode resultHead = result;
        if(startNodeHead!=null){
            result.next = startNodeHead;
            result = startNodeEnd;
        }
        if(betReverseNode!=null){
            result.next = betReverseNode;
            result = betNodeHeadEnd;
        }
        if(endNodeHead!=null){
            result.next = endNodeHead;
        }
        return resultHead.next;

    }




    private static ListNode reverseListNode(ListNode head) {
       if (head == null || head.next == null) {
         return head;
       }
      //递归获取当前节点的后一个节点
        ListNode tmp = reverseListNode(head.next);
        ListNode node = head.next;
        head.next = null;
        node.next = head;
        return tmp;
    }

    public static void main(String[] args) {
      int[]  head = {1,2,3,4,5};
              int left = 2;
                      int right = 4;

        ListNode listNode = reverseBetween(ListNode.init(head), left, right);
        //ListNode listNode = reverseListNode(ListNode.init(head));
        ListNode.toString(listNode);


    }
}
