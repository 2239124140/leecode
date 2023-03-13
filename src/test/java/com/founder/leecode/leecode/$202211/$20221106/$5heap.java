package com.founder.leecode.leecode.$202211.$20221106;

public class $5heap {

    private static int[] heap ;
    private static int[] sort ;

    //根据原数组source，构造出堆heap
    private static void createHeap(int[] source) {
        heap = new int[source.length+1];
        sort = new int[source.length];
    }

    //对source数组中的数据从小到大排序
    public static  void sort(int[] source) {

        System.arraycopy(source,0,heap,1,source.length);
        //对堆中的元素做下沉调整(从长度的一半处开始，往索引1处扫描)
        for (int i = (heap.length)/2;i>0;i--){
            sink(heap,i,heap.length-1);
        }





    }


    //交换heap堆中i索引和j索引处的值
    private static  void exch( int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }



    //往堆中插入一个元素
    public static void insert(int t){

    }


    //删除堆中最大的元素,并返回这个最大元素
    public static int delMax(){
      return -1;
    }



    //在heap堆中，对target处的元素做下沉，范围是0~range
    private static void sink(int[] heap, int target, int range){
        while(2*target<=range){
            //1.找出当前结点的较大的子结点
            int max;
            if (2*target+1<=range){
                if (less(2*target,2*target+1)){
                    max = 2*target+1;
                }else{
                    max = 2*target;
                }
            }else{
                max = 2*target;
            }
            //2.比较当前结点的值和较大子结点的值
            if (!less(target,max)){
                break;
            }
            exch(target,max);
            target = max;
        }
    }


    //判断heap堆中索引i处的元素是否小于索引j处的元素
    private static  boolean less( int i, int j) {
        return heap[i]<heap[j];
    }



    //使用上浮算法，使索引k处的元素能在堆中处于一个正确的位置
    private void swim(int k){
        //通过循环，不断的比较当前结点的值和其父结点的值，如果发现父结点的值比当前结点的值小，则交换位置
        //通过循环，不断的比较当前结点的值和其父结点的值，如果发现父结点的值比当前结点的值小，则交换位置
        while(k>1){
            //比较当前结点和其父结点

            if (less(k/2,k)){
                exch(k/2,k);
            }

            k = k/2;
        }

    }
    public static void main(String[] args) {


    }
}
