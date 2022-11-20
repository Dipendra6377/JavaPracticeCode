package com.company.Revision;

import java.util.Arrays;

public class Arrays_12_Wave_Array_Brute_Force {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;

        wave(arr,n);

        for(int i:arr)
            System.out.print(i + " ");
    }

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void wave(int[] arr,int n){

        // TIME COMPLEXITY O(NLOGN)
        Arrays.sort(arr);

        for(int i=0;i<n-1;i+=2){
            swap(arr,i,i+1);
        }
    }
}
