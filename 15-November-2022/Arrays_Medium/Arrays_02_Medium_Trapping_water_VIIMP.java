package com.company.Arrays;

public class Arrays_02_Medium_Trapping_water_VIIMP {
    public static void main(String[] args) {
        int[] arr={7,4,0,9};
        int n=arr.length;

        System.out.println(water(arr,n));
    }

    //  TIME COMPLEXITY O(N)  SPACE COMPLEXITY  O(1)
    static long water(int[] arr,int n){
        long res=0;

        int l=0;
        int r=n-1;
        int maxright=0; int maxleft=0;

        while(l<r){
            if(arr[l]<=arr[r]){
                if(arr[l] >=maxleft){
                    maxleft=arr[l];

                }
                else{
                    res+=maxleft-arr[l];
                }
                l++;
            }
            else{
                if(arr[r]>=maxright){
                    maxright=arr[r];

                }
                else {
                    res+=maxright-arr[r];
                }
                r--;
            }
        }
        return res;
    }
}
