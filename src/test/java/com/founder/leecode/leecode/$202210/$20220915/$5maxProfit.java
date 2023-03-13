package com.founder.leecode.leecode.$202210.$20220915;

public class $5maxProfit {

    public static int maxProfit(int[] prices) {
        int result = 0 ;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            int i1 = getmaxNum(prices, i + 1, prices.length);
            int i2 = i1 - price;
            if(i2>result){
                result = i2;
            }
        }
        return result;
    }
    public static int getmaxNum(int[] prices,int start,int end) {
        int result = 0 ;
        for (int i = start; i < end; i++) {
            int price = prices[i];
            if(price>result){
                result = price;
            }
        }
        return result;
    }


    public static int maxProfit1(int[] prices) {
        int min = Integer.MAX_VALUE;
        int result = 0 ;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            if(price<min){
               min = price;
            }else{
                int count= price -min;
                if(count> result){
                    result = count;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int i = maxProfit(prices);
        System.out.println(i);
    }
}
