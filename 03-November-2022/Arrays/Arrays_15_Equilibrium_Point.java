package com.company.Arrays;

public class Arrays_15_Equilibrium_Point {
    public static void main(String[] args) {
        int arr[] ={3,4,8,-9,20,6};
        int n= arr.length;

        System.out.println(Equilibrium(arr,n));
    }
    static int Equilibrium(int[] arr,int n){
        if(n==1){
            return arr[0];
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int l_sum=0;
        int r_sum=0;
        for(int i=0;i<n;i++){
            if(l_sum==r_sum-arr[i]){
                return i+1;
            }
            l_sum+=arr[i];

            r_sum=sum-l_sum;
        }
        return -1;
    }
}
