package com.company.Arrays;

public class Arrays_17_Peak_Element {
    public static void main(String[] args) {
        int arr[] = {1,13};
        int n=arr.length;

        System.out.println(Peak(arr,n));
    }
    static int Peak(int[] arr,int n){
        if(n==1){
            return 0;
        }
        if(arr[0]>=arr[1]){
                return 0;
        }
        if(arr[n-1]>=arr[n-2]){
            return n-1;
        }
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return i;
            }
        }

        return -1;
    }
}
