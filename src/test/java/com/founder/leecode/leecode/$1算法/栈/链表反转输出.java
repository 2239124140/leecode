package com.founder.leecode.leecode.$1算法.栈;

import com.founder.leecode.leecode.$1BaseDO.ListNode;

import java.util.Stack;

public class 链表反转输出 {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop().val;
        }
        return print;
    }

}
