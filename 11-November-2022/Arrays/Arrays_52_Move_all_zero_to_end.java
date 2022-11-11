package com.company.Arrays;

public class Arrays_52_Move_all_zero_to_end {
    public static void main(String[] args) {
        int[] arr={1,2,0,0,4};
        int n=arr.length;

        move_zero(arr,n);

        for (int i:arr){
            System.out.print(i + " ");
        }
    }
    static void move_zero(int[] arr,int n){

        int j=0;
        for(int i=0;i<n;i++){

            if(arr[j]!=0){
                j++;
                continue;
            }

            if(arr[j]==0){
                if(arr[i]!=0){
                    swap(arr,i,j);
                    j++;
                }
            }
        }

    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
