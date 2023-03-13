package com.founder.leecode.leecode.$202211.$20221102;

import com.founder.leecode.leecode.$1BaseDO.ListNode;

import java.util.ArrayList;
import java.util.List;

public class $3swapPairs {


    public static ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        List<ListNode> listNodeList= new ArrayList();
        while (head!=null){
            ListNode next = head.next;
            head.next = null;
            listNodeList.add(head);
            head = next;
        }
        ListNode root =listNodeList.get(1);
        ListNode result = root;
        root.next = listNodeList.get(0);
        root = root.next;
        for (int i = 2; i < listNodeList.size(); i=i+2) {
            if(i+1<listNodeList.size() ){
                root.next = listNodeList.get(i+1);
                root.next.next = listNodeList.get(i);
                root = root.next.next;
            }else{
                root.next = listNodeList.get(i);
                root = root.next;
            }
        }
        return result;
    }

    public static void main(String[] args) {

       int[] head = {1};
        ListNode init = ListNode.init(head);

        ListNode listNode = swapPairs(init);
        ListNode.toString(listNode);
    }
}
