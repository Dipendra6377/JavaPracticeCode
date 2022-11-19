package com.company.Revision;

import java.util.ArrayList;

public class Arrays_09_Stock_buy_and_sell {
    public static void main(String[] args) {
        int[] arr={100,180,260,310,40,535,695};
        int n=arr.length;

        ArrayList<ArrayList<Integer>> res=stock(arr,n);
        for (int i=0;i<res.size();i++){
            System.out.print(res.get(i) +" ");
        }
    }
    static ArrayList<ArrayList<Integer>> stock(int[] arr, int n){

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        int buy=0;
        int sell=0;
        for(int i=1;i<n;i++){
            ArrayList<Integer> res=new ArrayList<>();
            int diff=arr[i]-arr[i-1];

            if(diff>0){
                sell=i;
            }
            else{
                if(sell>buy)
                {

                    res.add(buy);
                    res.add(sell);
                    list.add(res);
                }
                buy=i;
            }

        }
        if(sell>buy){
            ArrayList<Integer> res=new ArrayList<>();
            res.add(buy);
            res.add(sell);
            list.add(res);
        }

        return list;

    }
}
