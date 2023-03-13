package com.founder.leecode.leecode.$1BaseDO;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

   public static ListNode init(int[] array){
        if(array==null||array.length==0){
            return null;
        }
        if(array.length==1){
            return new ListNode(array[0]);
        }
        ListNode root = new ListNode(array[0]);
        ListNode next = new ListNode(array[1]);
        root.next = next;
        for (int i = 2; i < array.length; i++) {
            ListNode curry =  new ListNode(array[i]);
            next.next = curry;
            next = curry;
        }
        return root;
    }
    public static void toString(ListNode listNode) {
        int i=0;
        ListNode head = new ListNode(0,listNode);
        head = head.next;
        while (head!=null){
            System.out.println(
                    i++ +" "+head.val
            );
            head =head.next;
        }
    }

    public static void main(String[] args) {
        int[] array= {1,2,3,4};
        ListNode init = init(array);
        int i=0;
        while (init!=null){
            System.out.println(
                    i++ +" "+init.val
            );
            init =init.next;
        }

    }
}
