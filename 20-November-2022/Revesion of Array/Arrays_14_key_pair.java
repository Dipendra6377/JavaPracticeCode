package com.company.Revision;

import java.util.Arrays;

public class Arrays_14_key_pair {
    public static void main(String[] args) {
        int[] arr={1, 4, 45, 6, 10, 8};
        int n=arr.length;
        int k=10;

        System.out.println(key(arr,n,k));
    }

    static boolean key(int[] arr,int n,int k){
        //TIME COMPLEXITY O(NLOGN)
        Arrays.sort(arr);
        int i=0;
        int j=n-1;

        while(i<j){
            if(arr[i]+arr[j]==k){
                return true;
            }
            if(arr[i]+arr[j]>k){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
