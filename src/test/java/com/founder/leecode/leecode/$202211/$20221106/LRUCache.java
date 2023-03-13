package com.founder.leecode.leecode.$202211.$20221106;

import java.util.HashMap;
import java.util.Map;

public class LRUCache  {

   private  int capacity;
   private  int size;
   private Map<Integer,Node> map;
   private Node head;
   private Node tail;

   class Node{
       private int key;
       private int value;
       private Node pre;
       private Node next;
   }

    public LRUCache(int capacity) {
       this.capacity =capacity;
       this.map =new HashMap();
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        Node node= map.get(key);
        if(node==null){
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    private void moveToHead(Node node) {
        Node pre = node.pre;
        Node next = node.next;
        next.pre = pre;
        pre.next = next;
        node.next = null;
        node.pre = null;
        addToHead(node);
    }

    private void addToHead(Node node) {
        Node next = head.next;
        head.next = node;
        next.pre = node;
        node.pre = head;
        node.next = next;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if(node==null){
            node = new Node();
            node.key = key;
            node.value = value;
            map.put(key,node);
            addToHead(node);
            size++;
        }else {
            node.value = value;
            moveToHead(node);
        }
        if(size>capacity){
            Node deletNode = tail.pre;
            Node pre = deletNode.pre;
            pre.next = tail;
            tail.pre = pre;
            map.remove(deletNode.key);
            size--;
        }
    }

    public static void main(String[] args) {

        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // 缓存是 {1=1}
        lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
        System.out.println(lRUCache.get(1));//返回 1
        lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        System.out.println(lRUCache.get(2));//返回 -1 (未找到)
        lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        System.out.println(lRUCache.get(1));//返回 -1 (未找到)
        System.out.println(lRUCache.get(3));
        lRUCache.get(4);

    }

}
