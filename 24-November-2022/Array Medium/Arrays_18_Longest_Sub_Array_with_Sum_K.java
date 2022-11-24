package com.company.Arrays_Medium_Level;

import java.util.HashMap;

public class Arrays_18_Longest_Sub_Array_with_Sum_K {
    public static void main(String[] args) {
        int[] arr={10, 5, 2, 7, 1, 9};
        int n=arr.length;
        int k=15;

        System.out.println(longest_subarray(arr,n,k));
    }
    static int longest_subarray(int[] arr,int n,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int sum=0;
        int max=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(sum-k==0){
                count=i+1;
            }
            if(!map.containsKey(sum-k)){
                map.put(sum,i);
            }
            else{
                count=i-map.get(sum-k);
            }
            max=Math.max(count,max);

        }
        return max;
    }
}
