package com.founder.leecode.leecode.$202210.$20220913;

public class $5mergeTwoLists {
   public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists1(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists1(l1, l2.next);
            return l2;
        }
    }




    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null&&list2==null){
           return null;
        }
        if(list1==null){
            if(list2!=null)
            return list2;
        }
        if(list2==null){
            if(list1!=null)
                return list1;
        }
        ListNode result = new ListNode();
        ListNode nextResult = new ListNode();
        result.next = nextResult;
        while (list1!=null){
            if(list2==null){
                nextResult.next = list1;
                break ;
            }
            ListNode curNext = new ListNode();
            if (list2!=null){
                int list1val = list1.val;
                int list2val = list2.val;
                 if(list1val<list2val){
                     curNext.val = list1val;
                     list1 = list1.next;
                 }else{
                     curNext.val = list2val;
                     list2 = list2.next;
                 }
            }
            nextResult.next = curNext;
            nextResult = nextResult.next;
        }
        if(list2!=null){
            nextResult.next = list2;
        }
       return  result.next.next;
    }


    public static void main(String[] args) {
        ListNode listNodeFirst4 = new ListNode(4,null);
        ListNode listNodeFirst2 = new ListNode(2,listNodeFirst4);
        ListNode listNodeFirst = new ListNode(1,listNodeFirst2);

        ListNode listNodeSecond4 = new ListNode(4,null);
        ListNode listNodeSecond3 = new ListNode(3,listNodeSecond4);
        ListNode listNodeSecond = new ListNode(1,listNodeSecond3);

        ListNode listNode = mergeTwoLists1(listNodeFirst, listNodeSecond);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode= listNode.next;
        }


    }
}
