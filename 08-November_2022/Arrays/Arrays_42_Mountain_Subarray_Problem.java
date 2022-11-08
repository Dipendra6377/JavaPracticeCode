package com.company.Arrays;

public class Arrays_42_Mountain_Subarray_Problem {
    public static void main(String[] args) {
        int[] arr={2,3,2,4,4,6,3,2};
        int n=arr.length;

        int left[]=new int[n];
        int right[]=new int[n];

        preprocess(arr,left,right,n);

        int l=0;
        int r=2;

        System.out.println((isSubarray(arr,l,r,left,right)));

    }
    static boolean isSubarray(int[] arr,int l,int r,int[] left,int[] right){
        return right[r]>=left[l];
    }

    static void preprocess (int[] arr,int[] left,int[] right,int n){
        left[0]=0;
        int lastinc=0;

        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                lastinc=i;
            }
            left[i]=lastinc;
        }
        for(int x:left)
            System.out.print(x + " ");

        System.out.println();
        right[n-1]=n-1;
        int firstdec=0;

        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1])
                firstdec=i;
            right[i]=firstdec;
        }

        for(int x:right)
            System.out.print(x+" ");
    }
}
