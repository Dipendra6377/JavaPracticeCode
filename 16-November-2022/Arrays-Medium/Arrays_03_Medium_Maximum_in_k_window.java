package com.company.Arrays_Medium_Level;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_03_Medium_Maximum_in_k_window {
    public static void main(String[] args) {
        int[] arr={1 ,2, 3, 1, 4, 5, 2, 3 ,6};
        int n=arr.length;
        int k=3;
        ArrayList<Integer> res=maximum(arr,n,k);

        for(int i=0;i< res.size();i++)
            System.out.print(res.get(i) + " ");
    }

    static ArrayList<Integer> maximum(int[] arr,int n,int k){
        // TIME COMPLEXITY O(N*K)
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<n-k+1;i++){
            int max=0;

            for(int j=0;j<k;j++){
                if(arr[j+i]>max)
                    max=arr[j+i];

            }
            list.add(max);
        }
        return list;
    }
}
