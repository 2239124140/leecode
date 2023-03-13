package com.founder.leecode.leecode.$202210.$20220926;

public class $2isPalindrome {

    public static class ListNode {
        Integer val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public  static ListNode reverseListMax(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static boolean   isPalindrome(ListNode head) {
        ListNode solw  = head;
        ListNode fast  = head;
        while (fast!=null&&fast.next!=null){
            solw =solw.next;
            fast =fast.next.next;
        }
        ListNode solwRever = reverseListMax(solw);
        while (solwRever!=null){
            if(solwRever.val!=head.val){
                return false;
            }
            solwRever = solwRever.next;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        ListNode head =  new ListNode(nums[0]);
        ListNode cur = new ListNode(nums[1]);
        head.next = cur;
        for (int i = 2; i < nums.length; i++) {
            ListNode  next = new ListNode(nums[i]);
            cur.next = next;
            cur = next;
        }

        System.out.println(isPalindrome(head));
    }

}
