package com.company.Arrays;

import com.company.Main;

import java.util.ArrayList;

public class Arrays_18_Stock_Buy_and_Sell_VIMP {
    public static void main(String[] args) {
        int[] arr = {100,180,260,310,40,535,695};
        int n=arr.length;

        ArrayList<ArrayList<Integer>> result = Stock(arr,n);
        for (int i=0;i<result.size();i++){
            System.out.print(result.get(i) + " ");
        }
    }
    static ArrayList<ArrayList<Integer>> Stock(int[] arr,int n){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int sell=0;
        int buy=0;

        for(int i=1;i<n;i++){
           int diff=arr[i]-arr[i-1];
            ArrayList<Integer> res=new ArrayList<>();

           if(diff>0){
               sell=i;
           }
           else {
               if(buy<sell){

                   res.add(buy);
                   res.add(sell);
                   ans.add(res);
               }
               buy=i;
           }
        }
        if(buy<sell){
            ArrayList<Integer> res=new ArrayList<>();
            res.add(buy);
            res.add(sell);
            ans.add(res);
        }
        return ans;
    }
}
