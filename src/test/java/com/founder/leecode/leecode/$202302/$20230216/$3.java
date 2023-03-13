package com.founder.leecode.leecode.$202302.$20230216;

import com.founder.leecode.leecode.$1BaseDO.ListNode;

public class $3 {


    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        ListNode result = new ListNode();
        boolean isAllNull = false;

        while (!isAllNull){
            isAllNull =true;
            int minNum = 0;
            for (int i = 0; i < lists.length; i++) {
                ListNode list = lists[i];
                if(list!=null){
                    isAllNull = false;
                    minNum = Math.min(list.val,minNum);
                }
            }

            for (int i = 0; i < lists.length; i++) {
                ListNode list = lists[i];
                if(list!=null){
                }
            }


        }
        return result;
    }

    public static void main(String[] args) {
        ListNode[]  lists = {
                ListNode.init(new int[]{1,4,5}),
                ListNode.init(new int[]{1,3,4}),
                ListNode.init(new int[]{2,6})
        };
        ListNode listNode = mergeKLists(lists);
        ListNode.toString(listNode);
    }
}
