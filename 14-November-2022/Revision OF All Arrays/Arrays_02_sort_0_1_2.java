package com.company.Revision;

public class Arrays_02_sort_0_1_2 {
    public static void main(String[] args) {
        int[] arr={1,2,0,1,0};
        int n=arr.length;

        sort(arr,n);

        for (int i:arr)
            System.out.print(i + " ");
    }
    static void swap(int[] arr,int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sort(int[] arr,int n){
        int i=0;
        int j=0;
        int k=n-1;

        while(j<=k){
            if(arr[j]==0){
                swap(arr,i,j);
                j++;
                i++;
            }
            else if(arr[j]==1){
                j++;
            }
            else{
                swap(arr,j,k);
                k--;
            }
        }
    }
}
