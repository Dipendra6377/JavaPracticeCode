package com.company.Arrays;

public class Arrays_12_Move_all_negative_elements_to_end {
    public static void main(String[] args) {
        int[] arr={1,-1,2,3,-2,-5,5,4};
        int n= arr.length;

        move(arr,n);

        for(int x:arr){
            System.out.print(x +" ");
        }
    }
    static void move(int[] arr,int n){
        int temp[]=new int[n];
        int k=0;

        for (int i=0;i<n;i++){
            if(arr[i]>=0){
                temp[k++]=arr[i];
            }

        }
        for (int i =0;i<n;i++){
            if(arr[i]<0){
                temp[k++]=arr[i];
            }
        }
        for (int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}
