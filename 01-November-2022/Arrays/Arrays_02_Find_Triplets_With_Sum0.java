package com.company.Arrays;

import java.util.Arrays;

public class Arrays_02_Find_Triplets_With_Sum0 {
    static boolean FindTriplet(int[] arr,int n){
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;

            while(j<k){
                if(arr[i]+arr[j]+arr[k]==0){
                    return true;
                }
                else if((arr[i]+arr[j]+arr[k])>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr ={-4,1,1,3,8};
        int n=arr.length;

        System.out.println(FindTriplet(arr,n));
    }
}
