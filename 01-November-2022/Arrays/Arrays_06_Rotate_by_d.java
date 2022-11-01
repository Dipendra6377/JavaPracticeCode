package com.company.Arrays;

public class Arrays_06_Rotate_by_d {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=2;

        fuck_rotation(arr,n,k);

        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void fuck_rotation(int[] arr,int n,int d){
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        for(int i=0;i<n-d;i++){
            arr[i]=arr[d+i];
        }
        for(int i=n-d;i<n;i++){
            arr[i]=temp[d+i-n];
        }
    }
}
