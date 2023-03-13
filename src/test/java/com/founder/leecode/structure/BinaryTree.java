package com.founder.leecode.structure;


public class BinaryTree<Key extends Comparable<Key>, Value> {
    //记录根结点
    private Node root;
    //记录树中元素的个数
    private int N;

    private class Node {
        //存储键
        public Key key;
        //存储值
        private Value value;
        //记录左子结点
        public Node left;
        //记录右子结点
        public Node right;

        public Node(Key key, Value value, Node left, Node right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    //获取树中元素的个数
    public int size() {
        return N;
    }

    //向树中添加元素key-value
    public void put(Key key, Value value) {
        put(root,key,value);
    }

    //向指定的树x中添加key-value,并返回添加元素后新的树
    private Node put(Node x, Key key, Value value) {
        if(x==null){
            N++;
            root = new Node(key,value,null,null);
        }
        if(key.compareTo(x.key)>0){
            put(x.left,key,value);
        }else if(x.key.compareTo(key)<0){
            put(x.right,key,value);
        }else{
            x.value =value;
        }
        return x;
    }

    //查询树中指定key对应的value
    public Value get(Key key) {
       return get(root,key);
    }

    //从指定的树x中，查找key对应的值
    public Value get(Node x, Key key) {
        if(x==null){
            return null;
        }
        if(key.compareTo(x.key)>0){
            return  get(x.left,key);
        }else if(x.key.compareTo(key)<0){
            return  get(x.right,key);
        }else{
            return x.value;
        }
    }


    //删除树中key对应的value
    public void delete(Key key) {
        delete(root, key);
    }

    //删除指定树x中的key对应的value，并返回删除后的新树
    public Node delete(Node x, Key key) {
        //x树为null
        if (x==null){
            return null;
        }
        //x树不为null
        int cmp = key.compareTo(x.key);
        if (cmp>0){
            //如果key大于x结点的键，则继续找x结点的右子树
            x.right = delete(x.right,key);
        }else if(cmp<0){
            //如果key小于x结点的键，则继续找x结点的左子树
            x.left = delete(x.left,key);
        }else{
            //如果key等于x结点的键，完成真正的删除结点动作，要删除的结点就是x；
            if(x.left==null){
                return x.right;
            }
            if(x.right==null){
                return x.left;
            }
            Node minParentNode = x.right;
            Node minNode = null;
            while (true){
                if(minParentNode.left==null){
                    minNode = minParentNode.left;
                    minParentNode.left =null;
                    break;
                }
            }
            minNode.left = x.left;
            Node minEndRightNode = minNode.right;
            while (minEndRightNode !=null){
                minEndRightNode = minNode.right;
            }
            minEndRightNode.right = x.right;
            x = minNode;
        }
        return x;
    }

//    //查找整个树中最小的键
//    public Key min(){
//    }
//
//    //在指定树x中找出最小键所在的结点
//    private Node min(Node x){
//    }
//
//    //在整个树中找到最大的键
//    public Key max(){
//    }
//
//    //在指定的树x中，找到最大的键所在的结点
//    public Node max(Node x){
//    }
//
//    //获取整个树中所有的键
//    public Queue<Key> preErgodic(){
//    }
//
//    //获取指定树x的所有键，并放到keys队列中
//    private void preErgodic(Node x,Queue<Key> keys){
//    }
//
//    //使用中序遍历获取树中所有的键
//    public Queue<Key> midErgodic(){
//    }
//
//    //使用中序遍历，获取指定树x中所有的键，并存放到key中
//    private void midErgodic(Node x,Queue<Key> keys){
//    }
//
//    //使用后序遍历，把整个树中所有的键返回
//    public Queue<Key> afterErgodic(){
//    }
//
//    //使用后序遍历，把指定树x中所有的键放入到keys中
//    private void afterErgodic(Node x,Queue<Key> keys){
//    }
//
//
//    //使用层序遍历，获取整个树中所有的键
//    public Queue<Key> layerErgodic(){
//    }
//
//
//    //获取整个树的最大深度
//    public int maxDepth(){
//    }
//
//    //获取指定树x的最大深度
//    private int maxDepth(Node x){
//    }

}

