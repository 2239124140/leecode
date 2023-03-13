package com.founder.leecode.structure;

public class JosephTest {
    public static void main(String[] args) {
        //1.构建循环链表，包含41个结点，分别存储1~41之间的值
        //用来就首结点
        Node<Integer> first = null;
        //用来记录前一个结点 存储变量使用
        Node<Integer> pre = null;
        for (int i = 1; i <= 41; i++) {
            //如果第一个结点
            if(i==1){
                first = new Node<>(i,null);
                pre = first;
                continue;
            }
            //中间节点
            Node<Integer> newNode = new Node<>(i, null);
            pre.next=newNode;
            pre=newNode;
            //如果是最后一个结点，那么需要让最后一个结点的下一个结点变为first,变为循环链表了
            if (i==41){
                pre.next=first;
            }
        }
        int count = 0;
        Node<Integer> preNode = null;
        Node<Integer> currentNode = first;
        while(currentNode!=currentNode.next){
            count++;
            if(first.next ==null){
                break;
            }
            if(count == 3){
                preNode.next = currentNode.next;
                count = 0;
                System.out.print(currentNode.item+",");
                currentNode =  currentNode.next;
            }else{
                preNode = currentNode;
                currentNode =currentNode.next;
            }
        }
        System.out.println(first.item);
    }
}
