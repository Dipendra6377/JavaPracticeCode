package com.company.Arrays;

public class Arrays_11_ThreeWayPartitioning {
    public static void main(String[] args) {
        int[] arr = {1,3,0,3,2,4};
        int a=2;
        int b=3;

        partition(arr,a,b);

        for (int ind=0;ind< arr.length;ind++){
            System.out.print(arr[ind] + " ");
        }


    }
    static void partition(int[] arr,int a,int b){
        int i=0;
        int j=0;
        int k=arr.length-1;

        while(j<=k){
            if(arr[j]>b){
                swap(arr,j,k);
                k--;
            }
            if(arr[j]<a){
                swap(arr,i,j);
                j++;i++;
            }

            else if(arr[j]>=a && arr[j]<=b){
                j++;
            }
        }


    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
