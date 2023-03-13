package com.founder.leecode.leecode.$1算法.栈;

import java.util.Stack;

public class 栈实现队列 {
    class CQueue {
        private Stack inStack=  new Stack<Integer>();
        private Stack  outStack=  new Stack<Integer>();
        public CQueue() {
        }

        public void appendTail(int value) {
            inStack.push(value);
        }

        public int deleteHead() {
            if(!outStack.isEmpty()){
                return (int) outStack.pop();
            }
            if(!inStack.isEmpty()){
                while (!inStack.isEmpty()){
                    outStack.push( inStack.pop());
                }
                return (int) outStack.pop();
            }
            return -1;
        }
    }
}
