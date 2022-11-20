package com.company.Revision;

public class Arrays_11_Wave_Array {
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

        //time Complexity  O(N)
        for(int i=0;i<n-1;i++){
            if(i%2==0){
                if(arr[i]<arr[i+1])
                    swap(arr,i,i+1);
            }
            else{
                if(arr[i]>arr[i+1])
                    swap(arr,i,i+1);
            }
        }
    }
}
