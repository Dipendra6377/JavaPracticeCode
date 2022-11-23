package com.company.Arrays_Medium_Level;

import java.util.Arrays;

public class Arrays_16_k_largest_elements {
    public static void main(String[] args) {
        int[] arr={12, 5, 787, 1, 23};
        int n=arr.length;
        int k=2;

       int[] res= k_largest(arr,n,k);
       for (int i:res)
           System.out.print(i +" ");
    }
    static int[] k_largest(int[] arr,int n,int k){
        Arrays.sort(arr);
        int[] ans=new int[k];
        int j=0;
        for(int i=n-1;i>=0;i--){
            if(k>0){
                ans[j++]=arr[i];
                k--;
            }
        }
        return ans;
    }
}
