package com.founder.leecode.structure;

import java.util.Objects;

public class LinkList<T> {
    Node head;
    int N;

    class Node{
        //存储数据
        T item;
        //下一个结点
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
    //构造方法
    public LinkList() {
        this.head = new Node(null,null);
        this.N =0;
    }
    //空置线性表
    public void clear(){
        this.head = new Node(null,null);
        this.N =0;
    }
    //判断线性表是否为空,是返回true ,否返回false
    public boolean isEmpty(){
        return  this.N == 0;
    }
    //获取线性表中元素的个数
    public int length(){
        return  this.N;
    }
    //读取并返回线性表中的第i个元素的值
    public T get(int i){
        Node next = head;
        for (int j = 0; j < i; j++) {
            next = next.next;
        }
        return next.item;
    }
    //往线性表中添加一个元素
    public void insert(T t){
       Node endNode = head;
       while (endNode.next == null){
           endNode = endNode.next;
       }
        endNode.next = new Node(t,null);
        N++;
    }
    //在线性表的第i个元素之前插入一个值为t的数据元素
    public void insert(int i,T t){
        Node next = head;
        for (int j = 0; j < i; j++) {
            next = next.next;
        }
        Node newNode = new Node(t, null);
        newNode.next = next.next;
        next.next = newNode;
        N++;
    }
    //删除并返回线性表中第i个数据元素
    public T remove(int i){
        Node beforeNode = head;
        for (int j = 0; j < i-1; j++) {
            beforeNode = beforeNode.next;
        }
        Node deleteNode = beforeNode.next;
        beforeNode.next = deleteNode.next;
        N--;
        return deleteNode.item;

    }
    //返回线性表中首次出现的指定的数据兀素的位序号,若不存在，则 返回-1。
    public int indexOf(T t){
        Node nodeCurrent = head;
        int index = 0;
        while (nodeCurrent.next == null){
            index ++;
            nodeCurrent = nodeCurrent.next;
            if(Objects.equals(nodeCurrent.item, t)){
                return index;
            }
        }
        return -1;
    }


    public  T  getMid(){
        Node fast = head;
        Node slow = head;
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.item;
    }
    public  boolean isCircle() {
        //定义快慢指针
        Node fast = head;
        Node slow = head;

        //遍历链表，如果快慢指针指向了同一个结点，那么证明有环
        while(fast!=null && fast.next!=null){
            //变换fast和slow
            fast = fast.next.next;
            slow = slow.next;
            if (fast.equals(slow)){
                return true;
            }
        }
        return false;
    }

}
