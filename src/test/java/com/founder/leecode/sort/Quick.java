package com.founder.leecode.sort;

public class Quick {


    private static void exch(int[] array,int i ,int j){
        int k= array[i];
        array[i]=  array[j];
        array[j]=  k;
    }
    private static void sort(int[] array) {
        int lo = 0;
        int hi = array.length-1;
        sort(array, lo, hi);
    }
    private static void sort(int[] array, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        //对a数组中，从lo到hi的元素进行切分
        int partition = partition1(array, lo, hi);
        sort(array,lo,partition );
        sort(array,partition +1,hi);

    }
    /*
    比较v元素是否小于w元素
    */
    private static boolean less(int v, int w) {
        return v<w;
    }

    public static int partition1(int[] a, int lo, int hi) {
        int key=a[lo];//把最左边的元素当做基准值
        int left=lo;//定义一个左侧指针，初始指向最左边的元素
        int right=hi+1;//定义一个右侧指针，初始指向左右侧的元素下一个位置
        //进行切分
        while(true){
            //先从右往左扫描，找到一个比基准值小的元素
            while(less(key,a[--right])){//循环停止，证明找到了一个比基准值小的元素
                if (right==lo){
                    break;//已经扫描到最左边了，无需继续扫描
                }
            }
            //再从左往右扫描，找一个比基准值大的元素
            while(less(a[++left],key)){//循环停止，证明找到了一个比基准值大的元素
                if (left==hi){
                    break;//已经扫描到了最右边了，无需继续扫描
                }
            }
            if (left>=right){
                //扫描完了所有元素，结束循环
                break;
            }else{
                //交换left和right索引处的元素
                exch(a,left,right);
            }
        }
        //交换最后rigth索引处和基准值所在的索引处的值
        exch(a,lo,right);
        return right;//right就是切分的界限
    }

    private static int partition(int[] array, int lo, int hi) {
      int value = array[lo];
      int left = lo;
      int right = hi+1;
      while (true){
          while(less(array[--right],value)){
              if(right==lo){
                  break;
              }
          }
          while(less(array[++left],value)){
              if(left==hi){
                  break;
              }
          }

          if (left>=right){
              //扫描完了所有元素，结束循环
              break;
          }else{
              //交换left和right索引处的元素
              exch(array,left,right);
          }
      }
        exch(array,lo,right);
        return right;//right就是切分的界限

    }


    public static void main(String[] args) {
    
        int min = Integer.MAX_VALUE;
        int[] array = new int[]{3,5,5};
        int length = array.length;
        sort(array);
        for(int i = 0; i < length-1; i++){
            min = Math.min(Math.abs(array[i] -  array[i+1]),min);
        }
        System.out.println(min);
    }



}
