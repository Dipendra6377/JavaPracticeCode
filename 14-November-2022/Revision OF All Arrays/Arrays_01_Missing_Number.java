package com.company.Revision;

import java.util.Arrays;
import java.util.HashMap;

public class Arrays_01_Missing_Number {
    public static void main(String[] args) {
        int[] arr={1};
        int n=2;

        System.out.println(missing(arr,n));
    }

    static int missing(int[] arr,int n){
        int sum=n*(n+1)/2;

        int arrsum=0;
        for (int i=0;i<n-1;i++){
            arrsum+=arr[i];
        }

        return sum-arrsum;




    }
}
