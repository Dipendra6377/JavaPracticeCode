package com.company.Arrays_Medium_Level;

public class Arrays_17_Minimum_swaps_and_K_together {
    public static void main(String[] args) {
        int[] arr={2, 1, 5, 6, 3};
        int n=arr.length;
        int k=3;

        System.out.println(minimum_swap(arr,n,k));
    }
    static int minimum_swap(int[] arr,int n,int k){
        int no_greater_than_k=0;
        int count=0;

        for(int i=0;i<n;i++){
            if(arr[i]<=k)
                count++;
        }

        for(int i=0;i<count;i++) {
            if (arr[i]>k)
                no_greater_than_k++;
        }

        int ans=no_greater_than_k;
        for(int i=0, j=count;j<n;j++,i++){
            if(arr[i]>k){
                no_greater_than_k--;
            }
            if(arr[j]>k){
                no_greater_than_k++;
            }
            ans=Math.min(ans,no_greater_than_k);
        }
        return ans;
    }
}
