package com.founder.leecode.structure;

public class Queue<T> {
    //记录首结点
    private Node head;
    //记录最后一个结点
    private Node last;
    //记录队列中元素的个数
    private int N;
    private class Node{
        public T item;
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
    public Queue() {
        head = new Node(null,null);
        N= 0 ;
        last = null;
    }

    //判断队列是否为空
    public boolean isEmpty(){
        return N==0;
    }

    //返回队列中元素的个数
    public int size(){
        return N;
    }

    //向队列中插入元素t
    public void enqueue(T t){
        Node node = new Node(t, null);
        N++;
        if(last ==null) {
            head.next = last;
        }
        last=node;
    }

    //从队列中拿出一个元素
    public T dequeue(){
        Node next = head.next;
        if(next==null){
            return null;
        }
        head.next = next.next;
        N--;
        if (isEmpty()){
            last=null;
        }
        return next.item;
    }
}
