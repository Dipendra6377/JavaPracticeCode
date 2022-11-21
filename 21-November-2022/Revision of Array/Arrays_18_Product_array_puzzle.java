package com.company.Revision;

public class Arrays_18_Product_array_puzzle {
    public static void main(String[] args) {
        int[] arr={10, 0, 0, 6, 2};
        int n= arr.length;

        long[] a=product(arr,n);

        for (long x: a)
            System.out.print(x+ " ");
    }

    static long[] product(int[] arr,int n){

        long prod=1;
        int count=0;

        long[] a=new long[n];
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
                continue;
            }
            prod=prod*arr[i];
        }
        if(count>1){
            return a;
        }
        if(count==1){
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    a[i]=prod;
                }
            }
            return a;
        }
        for(int i=0;i<n;i++){
            a[i]=prod/arr[i];
        }
        return a;
    }
}
