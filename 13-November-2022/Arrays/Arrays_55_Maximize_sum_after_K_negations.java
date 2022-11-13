package com.company.Arrays;

import java.util.Arrays;

public class Arrays_55_Maximize_sum_after_K_negations {
    public static void main(String[] args) {
        int[] arr={5, -2, 5, -4, 5, -12, 5, 5, 5, 20};
        int n= arr.length;
        int k=4;

        System.out.println(maximize_sum(arr,n,k));
    }

    static int maximize_sum(int[] arr,int n,int k){
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0 && k>0){
                arr[i]*=-1;
                k--;
            }

            sum+=arr[i];
            min=Math.min(min,arr[i]);
            System.out.println(min);
        }
        if(k!=0){
            if(k%2!=0){
                min*=-2;
                sum+=min;
            }
        }
        return sum;
    }

}
