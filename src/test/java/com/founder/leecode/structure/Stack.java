package com.founder.leecode.structure;

public class Stack<T> {
    int N;
    Node head;
    private class Node{
        public T item;
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
    public Stack() {
        N = 0;
        head = new Node(null,null);
    }

    //判断当前栈中元素个数是否为0
    public boolean isEmpty(){
        return N==0;
    }

    //获取栈中元素的个数
    public int size(){
        return N;
    }

    //把t元素压入栈
    public void push(T t){
        Node node = new Node(t, null);
        node.next = head.next;
        head.next = node;
        N++;
    }

    //弹出栈顶元素
    public T pop(){
        Node next = head.next;
        if (next==null){
            return null;
        }
        head.next =  head.next.next;
        N--;
        return next.item;
    }
}
