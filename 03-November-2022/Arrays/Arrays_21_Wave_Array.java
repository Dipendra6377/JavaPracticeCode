package com.company.Arrays;

public class Arrays_21_Wave_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n= arr.length;;

        Wave(arr,n);
        for(int x:arr){
            System.out.print(x + " ");
        }
    }
    static void swap(int arr[] ,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void Wave(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            if(i%2==0 && arr[i]<arr[i+1]){
                swap(arr,i,i+1);
            }
            if(i%2==1 && arr[i]>arr[i+1]){
                swap(arr,i,i+1);
            }
        }
    }
}
