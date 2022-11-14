package com.company.Revision;

import java.util.HashMap;

public class Arrays_04_equilibrium_point {
    public static void main(String[] args) {
        int[] arr={1,3,5,2,2};
        int n=arr.length;

        System.out.println(equilibrium(arr,n));
    }

    static int equilibrium(int[] arr,int n){
        if(n==1){
            return 1;
        }

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int l_sum=0;
        int r_sum=0;

        for(int i=0;i<n;i++){
            if(l_sum==r_sum-arr[i])
                return i+1;

            l_sum+=arr[i];
            r_sum=sum-l_sum;
        }
        return -1;
    }
}
