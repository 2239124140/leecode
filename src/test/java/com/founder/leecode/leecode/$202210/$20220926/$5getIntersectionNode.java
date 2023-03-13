package com.founder.leecode.leecode.$202210.$20220926;


import java.util.ArrayList;
import java.util.List;

public class $5getIntersectionNode {
    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA ==null||headB==null){
           return  null;
        }
        List<ListNode> ListNodeList1 = new ArrayList<>();
        List<ListNode> ListNodeList2 = new ArrayList<>();
        while (headA!=null){
            ListNodeList1.add(headA);
            headA = headA.next;
        }
        while (headB!=null){
            ListNodeList2.add(headB);
            headB = headB.next;
        }
        int size1 = ListNodeList1.size();
        int size2 = ListNodeList2.size();
        ListNode result = null;
        for (int i = Math.min(size1,size2); i >0; i--) {
            ListNode listNode = ListNodeList1.get(--size1);
            ListNode listNode1 = ListNodeList2.get(--size2);
            if(listNode==listNode1){
                result = listNode;
            }else{
                return result;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {1};

        List<ListNode> list1 =new ArrayList();
        List<ListNode> list2 =new ArrayList();
        ListNode allHas = null;
        for (int i = 0; i < nums1.length; i++) {
            ListNode listNode = new ListNode(nums1[i]);
            if(nums1[i]==1){
                allHas = listNode;
            }
            list1.add(listNode);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(nums2[i]==1){
                list2.add(allHas);
                continue;
            }
            ListNode listNode = new ListNode(nums2[i]);
            list2.add(listNode);
        }


        ListNode  head1 = list1.get(0);
        if(list1.size()>1){
            ListNode  cur1 =  list1.get(1);
            head1.next =cur1;
            for (int i = 2; i <list1.size(); i++) {
                ListNode  next = list1.get(i);
                cur1.next = next;
                cur1 = next;
            }
        }
        ListNode  head2 =  list2.get(0);
      if(list2.size()>1){
          ListNode  cur2 =  list2.get(1);
          head2.next =cur2;
          for (int i = 2; i <list2.size(); i++) {
              ListNode  next = list2.get(i);
              cur2.next = next;
              cur2 = next;
          }
      }


        ListNode intersectionNode = getIntersectionNode(head1, head2);
        System.out.println(intersectionNode.val);
        //  System.out.println(getIntersectionNode(list.get(0)));
    }
}
