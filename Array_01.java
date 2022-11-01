package com.company;

public class Array_01 {
    public static void reverseInGroup(int[] arr,int n,int k){
        for(int i=0;i<n;i=i+k){
            int start =i;
            int end  =Math.min(i+k-1,n-1);

            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int k=3;
        int n= arr.length;

        reverseInGroup(arr,n,k);

        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
