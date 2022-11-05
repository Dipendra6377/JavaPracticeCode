package com.company.Arrays;

public class Arrays_29_Need_some_change {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;

        for(int i=2;i<n;i++){
            swap(arr,i-2,i);
        }

        for (int x:arr){
            System.out.print(x + " ");
        }
    }
    public static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
