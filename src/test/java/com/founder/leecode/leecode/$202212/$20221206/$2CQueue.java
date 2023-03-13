package com.founder.leecode.leecode.$202212.$20221206;

import com.founder.leecode.structure.Stack;

public class $2CQueue {



    static class CQueue {
        private Stack  inStack=  new Stack<Integer>();
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




    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(1);
        cQueue.appendTail(2);
        cQueue.deleteHead();
        cQueue.deleteHead();
        cQueue.deleteHead();

    }
}
